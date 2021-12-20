package day01;

public class List08 {

	public static void main(String[] args) {
String cumle = "I love Java";
		
		String ters ="";
		boolean polindrome =true;
		
		for (int i = cumle.length()-1; i >=0 ; i--) {
			
			ters+=cumle.charAt(i);
			if (cumle.charAt(i)!=cumle.charAt(cumle.length()-1-i)) {
				polindrome=false;
			}
		}
		
		
		System.out.print("kelimenin tersten yazilimi: "+ters+" ,");
		
		if (!polindrome) {
			System.out.print("Polindrome degildir");
		} else {
			System.out.print("Polindromedur");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}


	
