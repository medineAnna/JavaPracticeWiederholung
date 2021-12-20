package teamQuestions;

import java.util.Scanner;

public class Char_01 {

	public static void main(String[] args) {
		//Soru 3) Kullanicidan bir karakter 
		//girmesini isteyin ve girilen 
		//karakterin harf olup olmadigini yazdirin

		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen karakter gir:");
		
		char harf=scan.next().charAt(0);
		
		if(Character.isLetter(harf)) {
			System.out.println("harftir");
		}else if(Character.isDigit(harf)) {
			System.out.println("Rakamdir");
		}else {
			System.out.println("Harf ve rakam degildir");
		}
		

	}

}
