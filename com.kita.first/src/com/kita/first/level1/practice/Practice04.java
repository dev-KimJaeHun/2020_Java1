package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
//		switch문을 사용해서
//		스캐너로 정수값 하나 입력 받고
//		그 값이 홀수면 "홀수입니다."
//		짝수면 "짝수입니다.:
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력하시오.: ");
		int num = scan.nextInt();
		scan.close();
		
		switch(num%2) {
			case 1:
				System.out.println("홀수입니다.");
				break;
			default:
				System.out.println("짝수입니다.");
		}
	}

}
