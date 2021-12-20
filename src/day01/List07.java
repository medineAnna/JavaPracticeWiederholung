package day01;

import java.util.ArrayList;
import java.util.List;

public class List07 {

	public static void main(String[] args) {
		
		List<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		System.out.println(numbers);
		numbers.remove(5);
		System.out.println(numbers);

	}

}
