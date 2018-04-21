package cal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int n1=(new Scanner(System.in)).nextInt();
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int n2=(new Scanner(System.in)).nextInt();
		String s=(new Scanner(System.in)).next();
		switch(s) {
		case "+":
			add(n1,n2);
			break;
		case "-":
			min(n1,n2);
			break;
		case "*":
			mul(n1,n2);
			break;
		case "/":
			div(n1,n2);
			break;
		}
	}
	void add(int n1,int n2) {
		System.out.println("결과값은 "+(n1+n2));
	}
	void minus(int n1, int n2) {
		System.out.println("결과값은 "+(n1-n2));
	}
	void max(int n1, int n2, int nMax) {
		nMax = n1;
		System.out.println("결과값은 "+(nMax>n2?nMax:n2));
	}
	void min(int n1, int n2, int nMin) {
		nMin = n1;
		System.out.println("결과값은 "+(nMin<n2?nMin:n2));
	}
	void makePic(int n1, int n2) {
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.print(" .");
			}System.out.println();
		}

	}
}
