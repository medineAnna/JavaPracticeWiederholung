package teamQuestions;

import java.util.Scanner;

public class ForLoopMedine {

	public static void main(String[] args) {
		// Soru 5 Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
        // girdigi sayiya gore asagidaki sekli yazdirin
        // orn : 3 girilirse
        // 1
        // 1 2
        // 1 2 3
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz.");
		
		int sayi=scan.nextInt();
		
		if(sayi<=10) {
			for (int i = 1; i <=sayi; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
				}
		}else System.out.println("10'dan kucuk sayi giriniz.");
		
	}

}
