package loesung;

public class GelbesMinion extends Minion {

	public GelbesMinion(int evilNumber) {
		super(evilNumber, MinionType.GELB);
		erstellen();
	}
	
	@Override
	protected void erstellen(){
		System.out.println("Banana?");
	}
	
}
