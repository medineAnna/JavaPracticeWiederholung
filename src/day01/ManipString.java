package day01;

import java.util.Scanner;

public class ManipString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Cumle giriniz: ");
		String cumle=scan.nextLine().toUpperCase();
		
		System.out.println("Kelime giriniz: ");
		String kelime=scan.next().toUpperCase();
		
		int index=cumle.indexOf(kelime);
		
		if(index<0) {
			System.out.println("Kullanilmamis.");
		}else if(cumle.indexOf(kelime,index+1)==(-1)){
			System.out.println("Bir kez kullanilmis.");
		}else {
			System.out.println("Birden fazla kullanilmistir.");
		}
		
		

	}

}
