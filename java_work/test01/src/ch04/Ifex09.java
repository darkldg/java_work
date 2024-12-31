package ch04;

import java.util.Scanner;

public class Ifex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("음료수의 종류 알려주세요(1:에스프레소,2:아메리카노,3:카푸치노,4:카페라떼");
		
		int a=sc.nextInt();
		System.out.println("잔의 수를 입력해주세요");
		int b=sc.nextInt();
		
		
		int charge=0;
		if(a==1) {
			System.out.println("에스프레소:");
			charge=2000*b;
		}else if(a==2) {
			System.out.println("아메리카노");
			charge=2500*b;
			
		}else if(a==3) {
			System.out.println("카푸치노:");
			charge=3000*b;
			
		}else if(a==4) {
			System.out.println("카페라떼:");
			charge=3500*b;
		}else {
			System.out.println("잘못입력했습니다");
			
		}
	    System.out.println("금액은"+charge+"입니다");	
		
			

				

	}

}


//int a=sc.nextInt();
//
//String a = "에스프레소";
//String b = "아메리카노";
//String c = "카푸치노";
//String d = "카페라떼";
//
//int e=2000;
//int f=2500;
//int g=3000;
//int h=3500;
//
//if(a>=1) {
//	System.out.println(a*b);
//}
	
	