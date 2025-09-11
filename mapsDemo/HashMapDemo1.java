package mapsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author : Eshu.Patel
 * Date : Sep 9, 2025
 * Time :2:45:09 PM
 * Project :CoreJava
*/

public class HashMapDemo1 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(11, "Jim");
		hm.put(12, "Dim");
		hm.put(13, "Yim");
		hm.put(null, "Tim");
		hm.put(15, "Rim");
		hm.put(null, "Bim");
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ "  " + m.getValue());
			
		}
	}
}
