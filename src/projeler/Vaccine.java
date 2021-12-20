package projeler;

import java.util.Scanner;

public class Vaccine {

	public static void main(String[] args) {
		/*Determiner who are above 15 years old to receive a vaccine,
		 *  enter number of students, 
		 *  input students names and ages, use arrays
		 *  15 yaşından büyük olup aşı yaptırmak için öğrenci sayısını girin, 
		 *  öğrencilerin adlarını ve yaşlarını girin, Array kullanın
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of students: ");//ogrenci sayisi
		int numStudents=scan.nextInt();
		
		String [] student=new String[numStudents];
		int[]age=new int[numStudents];//array  olusturduk
		Scanner scanName=new Scanner(System.in);
		Scanner scanAge=new Scanner(System.in);
		
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter name: ");
			student[i]=scanName.nextLine();//scanName objectin referans variable scana atadik
			System.out.println("Enter age: ");
			age[i]=scanAge.nextInt();//
		}
		for (int i = 0; i < numStudents; i++) {
			if(age[i]>=15) {
				System.out.println(student[i] + " can receive a vaccine.");
				System.out.println("The student is now " + age[i]);
			}
		}
		scan.close();
		scanAge.close();
		scanName.close();
		
	}

}
