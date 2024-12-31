package ch04;

import java.util.Scanner;

public class IFex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int avg=(a+b)/2;
		
		if(avg>=70 && a>60 && b>60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}

	}

}
