package ch03;

import java.util.Scanner;

public class Oaex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 2개를 입력하세요.");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		String c; 
//		c = ((a+b)>=70)?"합격":"불합격";
//		System.out.println(c);
		
	//  char result=((a+b)/2>=70)?'T':'F';   <--한글 할려면 String 영어단어 T F char
		String result=((a+b)/2>=70)?"합격":"불합격";
		System.out.println(result);
		sc.close();
		
		

	}

}
