package ch02;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();
        
        // 입력된 문자열이 비어있지 않은지 확인
        if (!input.isEmpty()) {
            // 첫 번째 문자를 소문자로 변환
            char a = input.charAt(0);
            char b = (char) (a + 32); // 대문자를 소문자로 변환
            System.out.println("변환된 문자: " + b);
        } else {
            System.out.println("입력된 문자열이 없습니다.");
        }
        
        sc.close(); // Scanner를 닫아줍니다.
    }
}
