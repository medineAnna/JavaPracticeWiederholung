package day01;

import java.util.ArrayList;
import java.util.List;

public class RepList02 {

	public static void main(String[] args) {
	/*	Create a 10-element list. Swap the 8th element with the 3rd element.

		INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		Output:

		[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali] */
		
		String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		List<String> str=new ArrayList<>();
		
		for (String each : names) {
			str.add(each);
		}
		System.out.println(str);
		
		String str1="";
		String str2="";
		
		str1+=str.get(3);
		str2+=str.get(8);
		
		str.set(3, str2);
		str.set(8, str1);
		System.out.println(str);

	}

}
