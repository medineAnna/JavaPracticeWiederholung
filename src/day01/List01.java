package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and find the maximum
		 *  occurring character in that string. (Ignore case sensitivity)

		input :

		Learning java is easy

		output:

		maximum occurring character is : a */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cumle giriniz: ");
		String cumle=scan.nextLine();
		
		int sayac=0;
		int max=0;
		String bos="";
		
		String arr[]=cumle.split("");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					sayac++;
				}
			}
			if(sayac>max) {
				max=sayac;
				bos=arr[i]+ "=" + sayac;
			}
			sayac=0;
		}
		System.out.println(bos);
		
		
		
		
		
	}}