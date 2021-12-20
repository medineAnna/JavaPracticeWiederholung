package konuAnlatim;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class C01_Ternary {

	public static void main(String[] args) {
		
	 /*  Scanner scan=new Scanner (System.in);
	   System.out.println("Sayi giriniz: ");
	   
	   double sayi=scan.nextDouble();
	   
	   System.out.println(sayi>0 ? "Pozitif" : sayi*sayi);
		
		
	
	    /*Soru1) Kullanicidan bir sayi alin,sayi pozitif ise Pozitif
	    * degil  ise Negatif saynin karesini yazdirin
	    * 
	     
		
		
		
		 *Soru2) Hava durumu tutan string degiskenin degerine gore asagidaki onergeleri
		 * uygulayan program yaziniz
		 *  "Yagmurlu"= Semsiye almalisin 
		 *  "Gunesli"=Bol bol D vitamin al 
		 *  "Kapali"="Yagmur yagabilir"
		 * 
		 */
		
	   String havaDurumu="Kapali";
	   System.out.println(havaDurumu=="Yagmurlu" ? "Semsiye almalisin" : (havaDurumu=="Gunesli" 
			   ? "Bol bol D vitamini al" : "Yagmur yagabilir"));
		

	}

}
