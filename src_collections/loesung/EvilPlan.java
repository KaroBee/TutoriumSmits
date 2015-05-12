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
		
		//Aufgabe 2
		ArrayList<Minion> liste = (ArrayList<Minion>) erstelleListe();
		
		//Aufgabe 4
		Set<Minion> treeSet = new TreeSet<>();
		for (Minion minion : liste) {
			if (minion.getFarbe() == MinionType.GELB){
				treeSet.add(minion);
			}
		}
		
		//AUSGABEN: toString() überschreiben + die Funktionalität in Methode auslagern
		schreibenInDatei(treeSet, "TreeSet.txt");
		
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
		  
		  System.out.println("Anzahl von Bananen:"+liste.size());
		  
	}

	private static ArrayList<Minion> erstelleListe() {
		ArrayList<Minion> list = new ArrayList<>();
		
		list.add(MinionFactory.zaehleMinion(34,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(41,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(37,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(65,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(14,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(24,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(75,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(87,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(58,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(81,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(85,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(71,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(97,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(100,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(63,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(37,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(16,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(30,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(1,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(50,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(72,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(67,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(4,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(93,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(56,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(39,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(85,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(35,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(48,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(78,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(34,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(37,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(65,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(81,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(89,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(99,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(62,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(22,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(4,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(7,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(59,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(88,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(91,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(29,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(14,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(43,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(19,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(3,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(34,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(24,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(10,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(53,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(76,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(75,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(13,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(46,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(80,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(47,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(86,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(92,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(21,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(87,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(58,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(50,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(72,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(81,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(20,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(5,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(44,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(70,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(61,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(11,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(37,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(66,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(95,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(0,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(40,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(60,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(13,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(68,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(96,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(76,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(13,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(46,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(26,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(49,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(17,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(33,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(54,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(34,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(41,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(43,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(19,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(3,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(34,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(1,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(50,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(72,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(82,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(98,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(27,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(81,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(42,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(9,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(73,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(4,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(75,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(13,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(31,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(81,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(6,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(23,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(8,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(14,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(24,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(94,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(1,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(50,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(72,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(75,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(43,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(19,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(3,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(41,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(69,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(83,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(87,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(58,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(57,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(25,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(18,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(76,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(13,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(46,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(15,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(84,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(4,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(90,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(55,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(36,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(2,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		list.add(MinionFactory.zaehleMinion(79,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(38,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(28,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(12,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(52,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(75,MinionType.VIOLETT));
		list.add(MinionFactory.zaehleMinion(45,MinionType.GELB));
		
		return list;
	}
	
}