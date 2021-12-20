package day01;

public class ArraySorular {

	public static void main(String[] args) {
		/*	Soru 2:
		getPopulation: 
		      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
		      countryNames Ülke isimleri
		      countryPopulations Ülke nüfusları
		    populationOfCountry adında bir metod yaznız.
		    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak
		    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
		    göndersin.
		      Ornegin;
		        countryNames = {"USA" ,"Mexico" ,"Canada"}
		        countryPopulations = {100000 , 120000 , 130000}
		        str = "Mexico"
		        return 120000 olmali
		        NOT : eger (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali
*/
		
		String countryName[]= {"USA", "Mexico", "Canada"};
		int population[]= {100000, 120000, 130000};
		String str="Mexico";
		
		nufus(countryName, population, str);
		
		System.out.println(nufus(countryName, population, str));
		
	}

	public static int nufus(String[] countryName, int[] population, String str) {
		int ters=0;
		for(int i=0; i<countryName.length; i++) {
			if(countryName[i].equals(str)) {
			ters=population[i]	;
			break;
			}else {
				ters=-1;
			}
		}
		
	return ters;
		
	}

}
