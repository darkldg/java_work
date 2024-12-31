package ch04;

public class Ifex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		if(score>70) {  //if 수행문에 괄호를 안해주면 처음 수행문이 적용되고 나머지는 출력된다. 수행문이 두줄이상일때는 중괄호가 필수이다.
			System.out.println(score);
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
			System.out.println("다시 도전하세요");
		}
		System.out.println("if문 벗어남");

	}

}
