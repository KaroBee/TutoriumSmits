
public final class Minion implements Comparable<Minion>{

	private int evilNumber;
	private String farbe;
	private boolean magBanane;
	private boolean magApfel;
	
	/**
	 * Leerer Konstruktor, ruft Parameter-Konstruktor mit Default-Werten auf
	 */
	public Minion(){
		this(0, "gelb", true, false);
	}
	
	/**
	 * 
	 * @param evilNumber: fortlaufende Inventar-Nummer
	 * @param farbe: Entweder "gelb" oder "violett". Bei anderen Eingaben wird als Default "gelb" gesetzt.
	 * @param magApfel: Ist bei violetten Minions default false. Ansonsten das, was angegeben ist.
	 */
	public Minion (int evilNumber, String farbe, boolean magBanane, boolean magApfel){
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
			this.magApfel = false;
		}else{
			//wenn ein Minion gelb ist, muss es mindestens die Bananen mögen
			this.magApfel = magApfel;
			if (this.farbe=="gelb"){
				this.magBanane = true;
			}
		}
	}
	
	public int getEvilNumber() {
		return evilNumber;
	}

	public String getFarbe() {
		return farbe;
	}

	public boolean isMagBanane() {
		return magBanane;
	}

	public boolean isMagApfel() {
		return magApfel;
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
		if (!farbe.equals(other.farbe))
			return false;
		if (magApfel != other.magApfel)
			return false;
		if (magBanane != other.magBanane)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String magB = "mag Banane";
		String magA = "mag Apfel";
		
		if (!magBanane){
			magB = "mag keine Bananen";
		}
		
		if (!this.magApfel){
			magA = "mag keine Äpfel";
		}
		
		String farbeText = farbe;
		if (farbe == "violett"){
			farbeText = "violett und böse";
		}
		
		return "Minion [ Nr." + evilNumber + ", "+farbeText+", "+magB+", "+magA+" ]";
	}
	
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
