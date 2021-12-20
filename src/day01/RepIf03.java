package day01;

public class RepIf03 {

	public static void main(String[] args) {
		/*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
		 *  Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
		Ornek:
		INPUT :
		25
		46
		OUTPUT :
		Numaralarin Toplami:
		71*/
		
		int sayi1=25;
		int sayi2=46;
		int toplam=sayi1+sayi2;
		
		if(sayi1>=0 && sayi2>=0) {
			System.out.println("Sayilarin toplami: " + toplam);
		}
	 
	}

}
