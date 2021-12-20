package day01;

import java.util.ArrayList;
import java.util.List;

public class Lise05 {

	public static void main(String[] args) {
		
		String list[]={"Ali","Veli","Ayse","Fatma","Omer"};
		
		List<String> str=new ArrayList<>();
		
		for(String string : list ) {
			str.add(string);
		}

		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).contains("a")) {
				
			 str.remove(i);
				i--;
				
			}
			
		}
		
		
		System.out.println(str);
		
		

	}

}
