package ch04;

import java.util.Scanner;

public class IFex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>=80&&b>=80){
			System.out.println("합격");
		
		}
		else
		System.out.println("불합격");

	}

}
