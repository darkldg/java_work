package ch04;

import java.util.Scanner;

public class Ifex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		
		int month=sc.nextInt();
		
		if(month<1 || month>12) {
			System.out.println("월을 잘못 입력했습니다.");
		}else {
			if(month>=3 && month<=5)
				System.out.println("봄");
			else if(month>=6 && month<=8)
				System.out.println("여름");
			else if(month>=9 && month<=10)
				System.out.println("가을");
			else
				System.out.println("겨울");
		}
		
//		int a=sc.nextInt();
//		
//		
//		if(a==3 || a==4 || a==5) {
//			System.out.println("봄");
//		}else if(a==6 || a==7 || a==8) {
//			System.out.println("여름");
//		}else if(a==9 || a==10 || a==11) {
//			System.out.println("가을");
//		}else 
//			System.out.println("겨울");
		

	}

}
