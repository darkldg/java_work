package ch03;

public class Opex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int i = 2;
		
		boolean a = ((num1 = num1 + 10)<10) && ((i = i +2)<10);
		System.out.println(a);
		System.out.println(num1);
		System.out.println(i);
		
		a = ((num1 = num1 +10)>10)||((i =1+2)<10);
		System.out.println(a);
		System.out.println(num1);
		System.out.println(i);

	}

}
