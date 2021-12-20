package studentPractic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {

	public static void main(String[] args) {
		
		List<String>filmListesi=new ArrayList<>();
		filmListesi.add("Titanik");
		filmListesi.add("Yuzuklerin Efendisi");
		filmListesi.add("God Father");
		filmListesi.add("Mucize Doktor");
		filmListesi.add("Cesur Yurek");
		filmListesi.add("Zubuk");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1'den " + filmListesi.size() + " 'a kadar bir sayi girin: ");
		
		int sira=scan.nextInt()-1;
		String filmAdi=filmListesi.get(sira).toLowerCase();
		
		System.out.println(filmAdi);
		String gizliIsim=filmAdi.replaceAll("\\S", "-");
		System.out.println(gizliIsim);
		
		List<Integer>index=new ArrayList<>();
		int count=0;
		
		do {
	
		System.out.println("Lutfen bir harf tahmin ediniz: ");
		char harf=scan.next().toLowerCase().charAt(0);
		String hrf=Character.toString(harf);
		
		if (!filmAdi.contains(hrf)) {
			count++;
		}
		
		if (count==3) {
			System.out.println("Kaybettin.");
			break;
		}
		System.out.println(count + " kadar hatali girdiniz..\nKalan hakkiniz: " + (3-count));
		for (int i = 0; i < filmAdi.length(); i++) {
			if (filmAdi.charAt(i)==harf) {
				index.add(i);
			} 
		}
		for (int i = 0; i < gizliIsim.length(); i++) {
			gizliIsim=gizliIsim.substring(0, index.get(i))+filmAdi.substring(index.get(i)+1)
			+gizliIsim.substring(index.get(i)+1);
		}if (filmAdi.equalsIgnoreCase(gizliIsim)) {
			System.out.println("Tebrikler Kazandiniz..");
		}
		} while (!filmAdi.equalsIgnoreCase(gizliIsim));
		
		
	}

}
