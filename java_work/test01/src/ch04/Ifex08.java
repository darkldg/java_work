package ch04;

import java.util.Scanner;

public class Ifex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("a,b,c를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
//
//		if(a>b && a>c) {
//			System.out.println(a);
//			if(b>a && b>c)
//				System.out.println(b);
//			else if(c>a && c>b)
//				System.out.println(c);
		
		if(a>b){
			if(a>c) {
				System.out.println(a);
				
			}else {
				System.out.println(c);
			}
				
		}else {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
	 

	}

}
