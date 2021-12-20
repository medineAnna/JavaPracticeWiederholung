package day01;

public class Static001 {
	String isim="Ali Can";
	static int yas;
	

	public static void main(String[] args) {
		Static001 obj1=new Static001();
		System.out.println(obj1.isim);
        System.out.println(obj1.yas);//static yoldan ulas ya da yas yaz
	}

}
