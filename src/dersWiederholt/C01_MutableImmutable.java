package dersWiederholt;

import java.util.StringTokenizer;

public class C01_MutableImmutable {

	public static void main(String[] args) {
	
		String str3="mehmet";
		String str4="mehmet";
		System.out.println("Klasik ==  " + (str3==str4));
		System.out.println("Klasik equals: " + str3.equals(str4));
		
		String str1= new String("mehmet");
		String str2= new String("mehmet");
		System.out.println("New ==  " + (str1==str2));
		System.out.println("New equals: " + str1.equals(str2));
	}

}
