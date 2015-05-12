package loesung;

public class ViolettesMinion extends Minion {

	public ViolettesMinion(int evilNumber) {
		super(evilNumber, MinionType.VIOLETT);
		erstellen();
	}

	@Override
	protected void erstellen() {
		System.out.println("Wrrrraaarrr");
	}
	
}
