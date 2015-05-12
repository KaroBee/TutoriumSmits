package loesung;

public class MinionFactory {

	public static Minion zaehleMinion(int nummer, MinionType farbe){
		Minion minion = null;
		
		//farbe muss "gelb" oder "violett" sein
		//im Zweifel ist die Farbe violett, um sicher zu gehen, dass genug Bananen da sind
		
		switch(farbe){
		case GELB:
			minion = new GelbesMinion(nummer);
			break;
		case VIOLETT:
			minion = new ViolettesMinion(nummer);
			break;
		default:
			minion = new ViolettesMinion(nummer);
			break;	
		}
		return minion;
	}
	
}
