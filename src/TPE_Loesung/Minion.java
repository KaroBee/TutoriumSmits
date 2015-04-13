package TPE_Loesung;

public final class Minion implements Comparable<Minion>{

	private int evilNumber;
	private String farbe;
	private boolean magBanane;
	private boolean magApfel;
	
	/**
	 * @param evilNumber: fortlaufende Inventar-Nummer
	 * @param farbe: Entweder "gelb" oder "violett". Bei anderen Eingaben wird als Default "gelb" gesetzt.
	 */
	public Minion (int evilNumber, String farbe){
		this.evilNumber = evilNumber;
		
		//farbe muss "gelb" oder "violett" sein
		if (farbe == null || (farbe!="gelb" && farbe!="violett")){
			this.farbe = "gelb";
		}else{
			this.farbe=farbe;
		}

		//wenn das Minion violett ist, isst es kein Obst
		if (this.farbe=="violett"){
			this.magBanane = false;
		}else{
			this.magBanane = true;
		}
	}
	
	
	/**
	 * @return int: Inventar-Nummer des Minions.
	 */
	public int getEvilNumber() {
		return evilNumber;
	}

	/**
	 * @return String: Farbe des Minions.
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @return boolean: ob ein Minion Bananen mag, oder nicht.
	 */
	public boolean magBanane() {
		return magBanane;
	}

	/**
	 * <Kommentar>
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Minion other = (Minion) obj;
		if (evilNumber != other.evilNumber)
			return false;
		if (!farbe.equals(other.farbe))
			return false;
		if (magApfel != other.magApfel)
			return false;
		if (magBanane != other.magBanane)
			return false;
		return true;
	}

	/**
	 * <Kommentar>
	 */
	@Override
	public int hashCode() {
		int result = 1;
		result += (""+evilNumber+"").hashCode();
		result += farbe.hashCode();
		result += (magBanane ? "true" : "false").hashCode();
		return result;
	}

	/**
	 * <Kommentar>
	 */
	@Override
	public String toString() {
	
		String magB;
		if (!magBanane){
			magB = "mag keine Bananen";
		}else{
			magB = "mag Banane";	
		}		
		
		String farbeText;
		if (farbe == "violett"){
			farbeText = "violett und böse";
		}else{
			farbeText = "gelb";
		}
		
		return "Minion [ Nr." + evilNumber + ", "+farbeText+", "+magB+" ]";
	}
	
	/**
	 * <Kommentar>
	 */
	public int compareTo(Minion o){
		if (o.evilNumber == evilNumber){
			return 0;
		} else if (o.evilNumber> evilNumber){
			return -1;
		}else{
			return 1;
		}
	}
	
}
