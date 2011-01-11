package de.earthdawn.config;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import javax.xml.bind.JAXBElement;

import de.earthdawn.data.CHARACTERISTICS;
import de.earthdawn.data.CHARACTERISTICSCIRCLE;
import de.earthdawn.data.CHARACTERISTICSCOST;
import de.earthdawn.data.CHARACTERISTICSDISCIPLINENR;
import de.earthdawn.data.CHARACTERISTICSENCUMBRANCE;
import de.earthdawn.data.CHARACTERISTICSATTRIBUTECOST;
import de.earthdawn.data.CHARACTERISTICSDEFENSERAITING;
import de.earthdawn.data.CHARACTERISTICSHEALTHRATING;
import de.earthdawn.data.CHARACTERISTICSLEGENDARYSTATUS;
import de.earthdawn.data.CHARACTERISTICSMYSTICARMOR;
import de.earthdawn.data.CHARACTERISTICSSTEPDICETABLE;


public class ECECharacteristics {

	private static CHARACTERISTICS CHARACTERISTICS = null;

	public ECECharacteristics(CHARACTERISTICS c) {
		CHARACTERISTICS = c;
	}
	
	public List<Integer> getENCUMBRANCE() {
		List<Integer> result = new ArrayList<Integer>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("ENCUMBRANCE") ) {
				int attriute = ((CHARACTERISTICSENCUMBRANCE)element.getValue()).getAttribute();
				int carrying = ((CHARACTERISTICSENCUMBRANCE)element.getValue()).getCarrying();
				result.add(attriute, carrying);
			}
		}
		return result;
	}

	public HashMap<Integer,Integer> getATTRIBUTECOST() {
		HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("ATTRIBUTECOST") ) {
				int modifier = ((CHARACTERISTICSATTRIBUTECOST)element.getValue()).getModifier();
				int cost = ((CHARACTERISTICSATTRIBUTECOST)element.getValue()).getCost();
				result.put(modifier, cost);
			}
		}
		return result;
	}

	public List<CHARACTERISTICSDEFENSERAITING> getDEFENSERAITING() {
		List<CHARACTERISTICSDEFENSERAITING> result = new ArrayList<CHARACTERISTICSDEFENSERAITING>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("DEFENSERAITING") ) {
				result.add((CHARACTERISTICSDEFENSERAITING)element.getValue());
			}
		}
		return result;
	}

	public HashMap<Integer,CHARACTERISTICSHEALTHRATING> getHEALTHRATING() {
		HashMap<Integer,CHARACTERISTICSHEALTHRATING> result = new HashMap<Integer,CHARACTERISTICSHEALTHRATING>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("HEALTHRATING") ) {
				CHARACTERISTICSHEALTHRATING value = ((CHARACTERISTICSHEALTHRATING)element.getValue());
				result.put(value.getValue(), value);
			}
		}
		return result;
	}

	public List<Integer> getMYSTICARMOR() {
		List<Integer> result = new ArrayList<Integer>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("MYSTICARMOR") ) {
				int armor = ((CHARACTERISTICSMYSTICARMOR)element.getValue()).getArmor();
				int attribute = ((CHARACTERISTICSMYSTICARMOR)element.getValue()).getAttribute();
				result.add(armor, attribute);
			}
		}
		return result;
	}

	public CHARACTERISTICSSTEPDICETABLE getSTEPDICEbyStep(int step) {
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("STEPDICETABLE") ) {
				CHARACTERISTICSSTEPDICETABLE result = ((CHARACTERISTICSSTEPDICETABLE)element.getValue());
				if( result.getStep() == step ) {
					return result;
				}
			}
		}
		// Not found
		System.err.println("Could not found a dice for the step value: "+step);
		return new CHARACTERISTICSSTEPDICETABLE();
	}

	public CHARACTERISTICSSTEPDICETABLE getSTEPDICEbyAttribute(int attribute) {
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("STEPDICETABLE") ) {
				CHARACTERISTICSSTEPDICETABLE result = ((CHARACTERISTICSSTEPDICETABLE)element.getValue());
				if( result.getAttribute() == attribute ) {
					return result;
				}
			}
		}
		// Not found
		return null;
	}

	public int getTalentRankTotalLP(int discipline, int circle, int rank) {
		if( rank < 1 ) return 0;
		List<CHARACTERISTICSCOST> costs = getTalentRankIncreaseLP(discipline,circle);
		if( costs == null ) return 0;
		int result = 0;
		for( CHARACTERISTICSCOST talentcost : costs ) {
			result += talentcost.getCost();
			rank--;
			if( rank < 1 ) break;
		}
		return result;
	}

	public int getSkillRankTotalLP(int rank) {
		if( rank < 1 ) return 0;
		// Summiere alle LegendenPunkte bis einschließlich "rank"
		int sum=0;
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("SKILLLPCOST") ) {
				CHARACTERISTICSCOST tmp = ((CHARACTERISTICSCOST)element.getValue());
				sum += tmp.getCost();
				rank--;
				if( rank < 1 ) break;
			}
		}
		return sum;
	}

	public int getAttributeTotalLP(int lpincrease) {
		if( lpincrease < 1 ) return 0;
		// Summiere alle LegendenPunkte
		int sum=0;
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("ATTRIBUTELPCOST") ) {
				CHARACTERISTICSCOST tmp = ((CHARACTERISTICSCOST)element.getValue());
				sum += tmp.getCost();
				lpincrease--;
				if( lpincrease < 1 ) return sum;
			}
		}
		System.err.println("The attribute value was increased "+lpincrease+" times to often.");
		return sum;
	}

	public List<CHARACTERISTICSCOST> getTalentRankIncreaseLP(int discipline, int circle) {
		if( discipline < 1 ) {
			System.err.println("Discipline number was smaller than one. Increase number to one.");
			discipline=1;
		}
		CHARACTERISTICSDISCIPLINENR disciplinenr = null;
		for( JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR() ) {
			if( element.getName().getLocalPart().equals("DISCIPLINENR") ) {
				CHARACTERISTICSDISCIPLINENR tmp = (CHARACTERISTICSDISCIPLINENR)element.getValue();
				if( tmp.getDisciplinenr() <= discipline ) disciplinenr = tmp;
			}
		}
		if( disciplinenr == null ) {
			System.err.println("Can not find LP for talents of discipline number "+discipline);
			return null;
		}
		CHARACTERISTICSCIRCLE circlenr = null;
		for (CHARACTERISTICSCIRCLE tmp : disciplinenr.getCIRCLE()) {
			if( tmp.getCircle() <= circle ) circlenr = tmp;
		}
		if( circlenr == null ) {
			System.err.println("Can not find LP for talents of discipline number "+discipline+" and cirlce number "+circle);
			return null;
		}
		return circlenr.getTALENTLPCOST();
	}

	public int getSpellLP(int circle) {
		if( circle < 1 ) return 0;
		return getTalentRankIncreaseLP(1, 1).get(circle-1).getCost();
	}

	public CHARACTERISTICSLEGENDARYSTATUS getLegendaystatus(int circle) {
		HashMap<Integer,CHARACTERISTICSLEGENDARYSTATUS> status = new HashMap<Integer,CHARACTERISTICSLEGENDARYSTATUS>();
		for (JAXBElement<?> element : CHARACTERISTICS.getENCUMBRANCEOrDEFENSERAITINGOrMYSTICARMOR()) {
			if( element.getName().getLocalPart().equals("LEGENDARYSTATUS") ) {
				CHARACTERISTICSLEGENDARYSTATUS st = (CHARACTERISTICSLEGENDARYSTATUS)element.getValue();
				status.put(st.getCircle(),st);
			}
		}
		while( circle >= 0 ) {
			if( status.containsKey(circle)) {
				return status.get(circle);
			}
			circle--;
		}
		// Not found
		return null;
	}
}
