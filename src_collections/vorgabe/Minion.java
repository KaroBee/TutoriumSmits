package vorgabe;

public class Minion {

	/**
	 * Die Nummer wird chronologisch gezählt.
	 */
	public int evilNumber;
	
	/**
	 * "gelb" oder "violett". Alles andere ist falsch. 
	 * Wenn es nicht gelb ist und nicht violett, 
	 * wird es trotzdem als gelb gezählt, um sicher zu gehen.
	 */
	public String farbe;
	
	/**
	 * Violette Minions mögen keine Bananen.
	 */
	public boolean magBanane;
	
	/**
	 * @param evilNumber: fortlaufende Inventar-Nummer
	 * @param farbe: Entweder "gelb" oder "violett". Bei anderen Eingaben ist das Minion immer "gelb".
	 */
	public Minion (int evilNumber, String farbe){
		
	}
}
