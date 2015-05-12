package vorgabe;

public class Minion {

	/**
	 * Die Nummer wird chronologisch gez�hlt.
	 */
	public int evilNumber;
	
	/**
	 * "gelb" oder "violett". Alles andere ist falsch. 
	 * Wenn es nicht gelb ist und nicht violett, 
	 * wird es trotzdem als gelb gez�hlt, um sicher zu gehen.
	 */
	public String farbe;
	
	/**
	 * Violette Minions m�gen keine Bananen.
	 */
	public boolean magBanane;
	
	/**
	 * @param evilNumber: fortlaufende Inventar-Nummer
	 * @param farbe: Entweder "gelb" oder "violett". Bei anderen Eingaben ist das Minion immer "gelb".
	 */
	public Minion (int evilNumber, String farbe){
		
	}
}
