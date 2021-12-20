package day01;

import java.util.ArrayList;
import java.util.List;

public class List06 {

	public static void main(String[] args) {

		
		String arr1 [] = {"John","Brad","Ange","Sofia","Emily"};
		
		String arr2 [] = {"sofia","brad","grace","emily","hazel"};
		
		List<String> list = new ArrayList<>();
		
		
		
		for (int i = 0; i < arr2.length; i++) {
			
			for (int j = 0; j < arr1.length; j++) {
				
				if (arr2[i].equalsIgnoreCase(arr1[j])) {
					
					list.add(arr2[i]);
					
				}
				
			}
			
		}
		
		
		
		System.out.println(list);
		
		
		

	}

}
