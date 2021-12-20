package day01;

public class Replit_01_Varargs {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts more than one integer as parameter and
		 * prints the sum of integers Method name = sum if you call method like that
		 * sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
		 */
		
		topla(1,2,3,4,5);
	}

	private static void topla(int... toplanacak) {
		int toplam=0;
		
		for (int each : toplanacak) {
			toplam+=each;
		}
		System.out.println(toplam);
	}

}
