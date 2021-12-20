package day01;


public class ArrayList09 {

	public static void main(String[] args) {
		
	

String kelime = "Learning java is easy";
		
		int max =0;
		int sayac =0;
		String str="";
		
		for (int i = 0; i < kelime.length(); i++) {
			
			for (int j = 0; j < kelime.length(); j++) {
				
				if (kelime.substring(i, i+1).equals(kelime.substring(j, j+1))) {
					
					sayac++;
					
				}
			
			}
			if (sayac>max) {
				max=sayac;
				str="Cumledeki en fazla olan karakter: "+kelime.substring(i, i+1);
			}
			
			sayac=0;
			
		}
		
		System.out.println(str);
		
		
		
	}

}