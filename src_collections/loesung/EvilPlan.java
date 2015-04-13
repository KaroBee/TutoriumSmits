package loesung;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class EvilPlan {
	
	public static void main(String[] args) {

		// Mein teuflischer Plan, die Minions zu zählen, hat begonnen ---- muHAHAHAH!
		ArrayList<Minion> liste = (ArrayList<Minion>) erstelleListe();
		
		//mit TreeSet: Comparable-Interface/ compareTo implementieren
		Set<Minion> treeSet = new TreeSet<>();
		for (Minion minion : liste) {
			if (minion.getFarbe() == "gelb"){
				treeSet.add(minion);
			}
		}
		
		//AUSGABEN: toString() überschreiben + die Funktionalität in Methode auslagern
		schreibenInDatei(treeSet, "TreeSet.txt");
		
		//Kleiner Konsolen-Check, ob das Programm durchgelaufen ist.
		System.out.println("fertig"); 
	}

	
	/**
	 * Nimmt die uebergebene Liste und schreibt sie in die angegebene Datei.
	 * Try/Catch geben einen Konsolenhinweis, 
	 * wenn das Schreiben in die Datei nicht funktioniert hat.
	 * 
	 * @param liste: Muss eine Collection aus Minions sein.
	 * @param dateiname: muss das Format "ABC.txt" haben.
	 * 
	 */
	public static void schreibenInDatei(Collection<Minion> liste, String dateiname){
		  FileWriter writer;
		  File file;
		  file = new File (dateiname);
		  
		  try {
			writer = new FileWriter(file ,true);
			for (Minion minion : liste) {
				writer.write(minion.toString());
				writer.write(System.getProperty("line.separator"));
			}
			
			writer.write("Anzahl von Bananen: "+liste.size());

		  	writer.flush();
		  	writer.close();
		  
		  } catch (IOException e) {
				System.out.println("Hat nicht funktioniert: "+dateiname);
		  }
	}

	/**
	 * Das war anstrengend - die halten einfach nicht still!!!
	 * @return Liste unserer Minions
	 */
	public static Collection<Minion> erstelleListe() {

		ArrayList<Minion> list = new ArrayList<>();
		list.add(new Minion(34,"violett"));
		list.add(new Minion(41,"violett"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(37,"violett"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(65,"violett"));
		list.add(new Minion(14,"violett"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(24,"violett"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(75,"violett"));
		list.add(new Minion(87,"gelb"));
		list.add(new Minion(58,"violett"));
		list.add(new Minion(81,"violett"));
		list.add(new Minion(85,"gelb"));
		list.add(new Minion(71,"violett"));
		list.add(new Minion(97,"violett"));
		list.add(new Minion(100,"violett"));
		list.add(new Minion(63,"violett"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(37,"violett"));
		list.add(new Minion(16,"violett"));
		list.add(new Minion(30,"violett"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(1,"gelb"));
		list.add(new Minion(50,"violett"));
		list.add(new Minion(72,"gelb"));
		list.add(new Minion(67,"violett"));
		list.add(new Minion(4,"gelb"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(93,"gelb"));
		list.add(new Minion(56,"violett"));
		list.add(new Minion(39,"gelb"));
		list.add(new Minion(85,"gelb"));
		list.add(new Minion(35,"violett"));
		list.add(new Minion(48,"gelb"));
		list.add(new Minion(78,"gelb"));
		list.add(new Minion(34,"violett"));
		list.add(new Minion(37,"violett"));
		list.add(new Minion(65,"violett"));
		list.add(new Minion(81,"violett"));
		list.add(new Minion(89,"gelb"));
		list.add(new Minion(99,"gelb"));
		list.add(new Minion(62,"gelb"));
		list.add(new Minion(22,"violett"));
		list.add(new Minion(4,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(7,"violett"));
		list.add(new Minion(59,"violett"));
		list.add(new Minion(88,"gelb"));
		list.add(new Minion(91,"violett"));
		list.add(new Minion(29,"violett"));
		list.add(new Minion(14,"violett"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(43,"gelb"));
		list.add(new Minion(19,"gelb"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(3,"violett"));
		list.add(new Minion(34,"violett"));
		list.add(new Minion(24,"violett"));
		list.add(new Minion(10,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(53,"violett"));
		list.add(new Minion(76,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(75,"violett"));
		list.add(new Minion(13,"gelb"));
		list.add(new Minion(46,"violett"));
		list.add(new Minion(80,"gelb"));
		list.add(new Minion(47,"gelb"));
		list.add(new Minion(86,"gelb"));
		list.add(new Minion(92,"gelb"));
		list.add(new Minion(21,"gelb"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(87,"gelb"));
		list.add(new Minion(58,"violett"));
		list.add(new Minion(50,"violett"));
		list.add(new Minion(72,"gelb"));
		list.add(new Minion(81,"violett"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(20,"violett"));
		list.add(new Minion(5,"gelb"));
		list.add(new Minion(44,"violett"));
		list.add(new Minion(70,"violett"));
		list.add(new Minion(61,"violett"));
		list.add(new Minion(11,"gelb"));
		list.add(new Minion(37,"violett"));
		list.add(new Minion(66,"gelb"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(95,"gelb"));
		list.add(new Minion(0,"gelb"));
		list.add(new Minion(40,"gelb"));
		list.add(new Minion(60,"gelb"));
		list.add(new Minion(13,"gelb"));
		list.add(new Minion(68,"gelb"));
		list.add(new Minion(96,"violett"));
		list.add(new Minion(76,"gelb"));
		list.add(new Minion(13,"gelb"));
		list.add(new Minion(46,"violett"));
		list.add(new Minion(26,"gelb"));
		list.add(new Minion(49,"gelb"));
		list.add(new Minion(17,"gelb"));
		list.add(new Minion(33,"gelb"));
		list.add(new Minion(54,"violett"));
		list.add(new Minion(34,"violett"));
		list.add(new Minion(41,"violett"));
		list.add(new Minion(43,"gelb"));
		list.add(new Minion(19,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(3,"violett"));
		list.add(new Minion(34,"violett"));
		list.add(new Minion(1,"gelb"));
		list.add(new Minion(50,"violett"));
		list.add(new Minion(72,"gelb"));
		list.add(new Minion(82,"violett"));
		list.add(new Minion(98,"gelb"));
		list.add(new Minion(27,"violett"));
		list.add(new Minion(81,"violett"));
		list.add(new Minion(42,"gelb"));
		list.add(new Minion(9,"violett"));
		list.add(new Minion(73,"violett"));
		list.add(new Minion(4,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(75,"violett"));
		list.add(new Minion(13,"gelb"));
		list.add(new Minion(31,"gelb"));
		list.add(new Minion(81,"violett"));
		list.add(new Minion(6,"gelb"));
		list.add(new Minion(23,"violett"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(8,"violett"));
		list.add(new Minion(14,"violett"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(24,"violett"));
		list.add(new Minion(94,"violett"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(1,"gelb"));
		list.add(new Minion(50,"violett"));
		list.add(new Minion(72,"gelb"));
		list.add(new Minion(75,"violett"));
		list.add(new Minion(43,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(19,"gelb"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(3,"violett"));
		list.add(new Minion(41,"violett"));
		list.add(new Minion(69,"violett"));
		list.add(new Minion(83,"violett"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(87,"gelb"));
		list.add(new Minion(58,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(57,"violett"));
		list.add(new Minion(25,"violett"));
		list.add(new Minion(18,"violett"));
		list.add(new Minion(76,"gelb"));
		list.add(new Minion(13,"gelb"));
		list.add(new Minion(46,"violett"));
		list.add(new Minion(15,"violett"));
		list.add(new Minion(84,"gelb"));
		list.add(new Minion(4,"gelb"));
		list.add(new Minion(90,"gelb"));
		list.add(new Minion(55,"gelb"));
		list.add(new Minion(36,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(2,"gelb"));
		list.add(new Minion(45,"gelb"));
		list.add(new Minion(79,"violett"));
		list.add(new Minion(38,"violett"));
		list.add(new Minion(28,"violett"));
		list.add(new Minion(12,"violett"));
		list.add(new Minion(52,"violett"));
		list.add(new Minion(75,"violett"));
		
		return list;
	}

}
