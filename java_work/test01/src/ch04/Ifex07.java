package ch04;

import java.util.Scanner;

public class Ifex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요.");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int avg=(a+b)/2;
		System.out.println("평균:"+avg);
		
		
		if(avg>=70 && a>60 && b>60) {
			System.out.println("합격");
			if(avg>=90)
				System.out.println("1등급");
			else if(avg>=80)
				System.out.println("2등급");
			else if(avg>=70)
				System.out.println("3등급");
			
				
		}
		else {
			System.out.println("불합격");
		}

	}

	

}
