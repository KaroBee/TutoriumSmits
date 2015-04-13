package TPE_Original;

public class Minion {

	public int evilNumber;
	public String farbe;
	public boolean magBanane;
	
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
}
