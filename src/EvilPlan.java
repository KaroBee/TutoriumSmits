import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class EvilPlan {

	
	public static void main(String[] args) {

		// Mein teuflischer Plan, die Minions zu zählen, hat begonnen ---- muHAHAHAH!
		Collection<Minion> alteListe = makeMinions();

		ArrayList<Minion> neueListe = (ArrayList<Minion>) alteListe;
		Set<Minion> neuesSet = new TreeSet<>();
		neuesSet.addAll(neueListe);

		// Ausdrucken
		System.out.println("--Alte Liste-----------------------------------------------------");
		for (Minion min : alteListe) {
			System.out.println(min);
		}
		
		System.out.println("--Neue Liste-----------------------------------------------------");
		for (Minion min : neueListe) {
			System.out.println(min);
		}
		
		System.out.println("--Neues Set-----------------------------------------------------");
		for (Minion min : neuesSet) {
			System.out.println(min);
		}
	}

	/**
	 * Das war anstrengend - die halten einfach nicht still!!!
	 * @return Liste unserer Minions
	 */
	public static Collection<Minion> makeMinions() {

		Collection<Minion> list = new ArrayList<>();
		list.add(new Minion(34,"violett",true,false));
		list.add(new Minion(41,"violett",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(37,"violett",false,false));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(65,"violett",true,false));
		list.add(new Minion(14,"violett",false,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(24,"violett",false,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(75,"violett",true,true));
		list.add(new Minion(87,"gelb",true,false));
		list.add(new Minion(58,"violett",true,false));
		list.add(new Minion(81,"violett",true,false));
		list.add(new Minion(85,"gelb",true,false));
		list.add(new Minion(71,"violett",true,true));
		list.add(new Minion(97,"violett",true,true));
		list.add(new Minion(100,"violett",true,true));
		list.add(new Minion(63,"violett",false,true));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(37,"violett",false,false));
		list.add(new Minion(16,"violett",false,false));
		list.add(new Minion(30,"violett",false,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(1,"gelb",true,false));
		list.add(new Minion(50,"violett",false,false));
		list.add(new Minion(72,"gelb",true,false));
		list.add(new Minion(67,"violett",false,true));
		list.add(new Minion(4,"gelb",true,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(93,"gelb",true,false));
		list.add(new Minion(56,"violett",false,false));
		list.add(new Minion(39,"gelb",true,false));
		list.add(new Minion(85,"gelb",true,false));
		list.add(new Minion(35,"violett",false,false));
		list.add(new Minion(48,"gelb",true,false));
		list.add(new Minion(78,"gelb",true,true));
		list.add(new Minion(34,"violett",true,false));
		list.add(new Minion(37,"violett",false,false));
		list.add(new Minion(65,"violett",true,false));
		list.add(new Minion(81,"violett",true,false));
		list.add(new Minion(89,"gelb",true,false));
		list.add(new Minion(99,"gelb",true,true));
		list.add(new Minion(62,"gelb",true,false));
		list.add(new Minion(22,"violett",true,false));
		list.add(new Minion(4,"gelb",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(7,"violett",true,false));
		list.add(new Minion(59,"violett",false,false));
		list.add(new Minion(88,"gelb",true,false));
		list.add(new Minion(91,"violett",true,false));
		list.add(new Minion(29,"violett",true,true));
		list.add(new Minion(14,"violett",false,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(43,"gelb",true,false));
		list.add(new Minion(19,"gelb",true,false));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(3,"violett",true,false));
		list.add(new Minion(34,"violett",true,false));
		list.add(new Minion(24,"violett",false,true));
		list.add(new Minion(10,"gelb",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(53,"violett",false,true));
		list.add(new Minion(76,"gelb",true,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(75,"violett",true,true));
		list.add(new Minion(13,"gelb",true,true));
		list.add(new Minion(46,"violett",false,true));
		list.add(new Minion(80,"gelb",true,false));
		list.add(new Minion(47,"gelb",true,false));
		list.add(new Minion(86,"gelb",true,true));
		list.add(new Minion(92,"gelb",true,false));
		list.add(new Minion(21,"gelb",true,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(87,"gelb",true,false));
		list.add(new Minion(58,"violett",true,false));
		list.add(new Minion(50,"violett",false,false));
		list.add(new Minion(72,"gelb",true,false));
		list.add(new Minion(81,"violett",true,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(20,"violett",true,false));
		list.add(new Minion(5,"gelb",true,true));
		list.add(new Minion(44,"violett",true,true));
		list.add(new Minion(70,"violett",false,true));
		list.add(new Minion(61,"violett",true,false));
		list.add(new Minion(11,"gelb",true,false));
		list.add(new Minion(37,"violett",false,false));
		list.add(new Minion(66,"gelb",true,true));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(95,"gelb",true,true));
		list.add(new Minion(0,"gelb",true,true));
		list.add(new Minion(40,"gelb",true,false));
		list.add(new Minion(60,"gelb",true,true));
		list.add(new Minion(13,"gelb",true,true));
		list.add(new Minion(68,"gelb",true,true));
		list.add(new Minion(96,"violett",false,true));
		list.add(new Minion(76,"gelb",true,false));
		list.add(new Minion(13,"gelb",true,true));
		list.add(new Minion(46,"violett",false,true));
		list.add(new Minion(26,"gelb",true,false));
		list.add(new Minion(49,"gelb",true,true));
		list.add(new Minion(17,"gelb",true,false));
		list.add(new Minion(33,"gelb",true,true));
		list.add(new Minion(54,"violett",true,false));
		list.add(new Minion(34,"violett",true,false));
		list.add(new Minion(41,"violett",true,true));
		list.add(new Minion(43,"gelb",true,false));
		list.add(new Minion(19,"gelb",true,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(3,"violett",true,false));
		list.add(new Minion(34,"violett",true,false));
		list.add(new Minion(1,"gelb",true,false));
		list.add(new Minion(50,"violett",false,false));
		list.add(new Minion(72,"gelb",true,false));
		list.add(new Minion(82,"violett",true,false));
		list.add(new Minion(98,"gelb",true,false));
		list.add(new Minion(27,"violett",false,true));
		list.add(new Minion(81,"violett",true,false));
		list.add(new Minion(42,"gelb",true,false));
		list.add(new Minion(9,"violett",true,true));
		list.add(new Minion(73,"violett",false,false));
		list.add(new Minion(4,"gelb",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(75,"violett",true,true));
		list.add(new Minion(13,"gelb",true,true));
		list.add(new Minion(31,"gelb",true,true));
		list.add(new Minion(81,"violett",true,false));
		list.add(new Minion(6,"gelb",true,true));
		list.add(new Minion(23,"violett",false,true));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(8,"violett",true,true));
		list.add(new Minion(14,"violett",false,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(24,"violett",false,true));
		list.add(new Minion(94,"violett",false,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(1,"gelb",true,false));
		list.add(new Minion(50,"violett",false,false));
		list.add(new Minion(72,"gelb",true,false));
		list.add(new Minion(75,"violett",true,true));
		list.add(new Minion(43,"gelb",true,false));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(19,"gelb",true,false));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(3,"violett",true,false));
		list.add(new Minion(41,"violett",true,true));
		list.add(new Minion(69,"violett",true,true));
		list.add(new Minion(83,"violett",true,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(87,"gelb",true,false));
		list.add(new Minion(58,"violett",true,false));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(57,"violett",true,false));
		list.add(new Minion(25,"violett",true,true));
		list.add(new Minion(18,"violett",true,true));
		list.add(new Minion(76,"gelb",true,false));
		list.add(new Minion(13,"gelb",true,true));
		list.add(new Minion(46,"violett",false,true));
		list.add(new Minion(15,"violett",true,true));
		list.add(new Minion(84,"gelb",true,true));
		list.add(new Minion(4,"gelb",true,true));
		list.add(new Minion(90,"gelb",true,true));
		list.add(new Minion(55,"gelb",true,true));
		list.add(new Minion(36,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(2,"gelb",true,false));
		list.add(new Minion(45,"gelb",true,false));
		list.add(new Minion(79,"violett",false,false));
		list.add(new Minion(38,"violett",true,false));
		list.add(new Minion(28,"violett",false,false));
		list.add(new Minion(12,"violett",false,true));
		list.add(new Minion(52,"violett",false,false));
		list.add(new Minion(75,"violett",true,true));
		
		return list;
	}

}
