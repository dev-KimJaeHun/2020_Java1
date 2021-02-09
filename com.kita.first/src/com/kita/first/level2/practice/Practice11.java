package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원
		
//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		
		Scanner sc = new Scanner(System.in);
		int num;
		int total = 0;
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		
		while(true) {
			System.out.print("메뉴를 입력하세요: (종료:0) ");
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			switch(num) {
			case 1:
				System.out.printf("%s %d원\n", menuArr[0], priceArr[0]);
				total = total + priceArr[0];
				break;
			case 2:
				System.out.printf("%s %d원\n", menuArr[1], priceArr[1]);
				total = total + priceArr[1];
				break;
			case 3:
				System.out.printf("%s %d원\n", menuArr[2], priceArr[2]);
				total = total + priceArr[2];
				break;
			case 4:
				System.out.printf("%s %d원\n", menuArr[3], priceArr[3]);
				total = total + priceArr[3];
				break;
			case 5:
				System.out.printf("%s %d원\n", menuArr[4], priceArr[4]);
				total = total + priceArr[4];
				break;
			case 6:
				System.out.printf("%s %d원\n", menuArr[5], priceArr[5]);
				total = total + priceArr[5];
				break;
			}
		}
		System.out.printf("합계 : %d원", total);
		sc.close();
		
	}
}
