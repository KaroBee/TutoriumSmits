package loesung;

public abstract class Minion implements Comparable<Minion> {

	/**
	 * Die Nummer wird chronologisch gezählt.
	 */
	private int evilNumber;
	
	/**
	 * "gelb" oder "violett". Alles andere ist falsch. 
	 * Wenn es nicht gelb ist und nicht violett, 
	 * wird es trotzdem als gelb gezählt, um sicher zu gehen.
	 */
	private MinionType farbe;
	
	/**
	 * Violette Minions mögen keine Bananen.
	 */
	private boolean magBanane;
	
	/**
	 * @param evilNumber: fortlaufende Inventar-Nummer
	 * @param farbe: Entweder "gelb" oder "violett". Bei anderen Eingaben ist das Minion immer "gelb".
	 */
	public Minion (int evilNumber, MinionType farbe){
		this.farbe = farbe;
		this.evilNumber = evilNumber;
		
		if (farbe == MinionType.GELB){
			magBanane = true;
		}else{
			magBanane = false;
		}	
	}

	/**
	 * @return evilNumber
	 */
	public int getEvilNumber() {
		return evilNumber;
	}

	/**
	 * @return farbe
	 */
	public MinionType getFarbe() {
		return farbe;
	}

	/**
	 * @return magBanane
	 */
	public boolean magBanane() {
		return magBanane;
	}
	
	//Methode für typspezifische Implementierung
	protected abstract void erstellen();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + evilNumber;
		result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
		result = prime * result + (magBanane ? 1231 : 1237);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Minion other = (Minion) obj;
		if (evilNumber != other.evilNumber)
			return false;
		if (farbe != other.farbe)
			return false;
		if (magBanane != other.magBanane)
			return false;
		return true;
	}
	
	//Fuer das Comparable-Interface
	public int compareTo(Minion o){
		if (o.evilNumber == evilNumber){
			return 0;
		} else if (o.evilNumber> evilNumber){
			return -1;
		}else{
			return 1;
		}
	}
	
	@Override
	public String toString() {
	
		String magB;
		if (!magBanane){
			magB = "mag keine Bananen";
		}else{
			magB = "mag Banane";	
		}		
		
		String farbeText;
		if (farbe == MinionType.VIOLETT){
			farbeText = "violett und böse";
		}else{
			farbeText = "gelb";
		}
		
		return "Minion [ Nr." + evilNumber + ", "+farbeText+", "+magB+" ]";
	}
	
	
}

