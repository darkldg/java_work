package ch02;

public class Binarytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int bNum=0B1010; //2진수
		int oNum=012; //8진수  
		int hNum=0XA; //16진수
		int bNum2=0B00000000000000000000000000000101;
		int bNum3=0B11111111111111111111111111111011;
		System.out.println(bNum2);
		System.out.println(bNum3);
		System.out.println(bNum2+bNum3);
		// <--주석   /* ~ */ <--대량으로 주석할시 끝에 넣어주면됨 다른방법은 드레스 해서 ctrl +/ 
		// 블럭 해제시는 똑같이 드레그 해서 ctrl + / 다시 해주면 알아서 다시 주석처리 사라짐
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);

	}

}
