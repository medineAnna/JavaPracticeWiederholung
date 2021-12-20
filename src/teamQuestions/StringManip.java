package teamQuestions;

import java.util.Scanner;

public class StringManip {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
		//ve asagidaki gibi yazdirin
	    // isim-soyisim : M***** B*******
	    // kart no : **** **** **** 1234
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz: ");
		String isim=scan.nextLine();
		isim=isim.substring(0,1).toUpperCase() + isim.replaceAll("\\w", "*");
		
		System.out.println("Lutfen soyisminizi giriniz: ");
		String soyisim=scan.next();
		soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.replaceAll("\\w", "*");
		
		System.out.println("Lutfen kart No giriniz: ");
		String kartNo=scan.next();
		kartNo="**** **** ****" + kartNo.substring(kartNo.length()-4);
		
		System.out.println(isim + " " + soyisim + " " + kartNo);
		}
	}


