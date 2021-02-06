package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		// 숫자를 입력: (종료:0) 5
		// 숫자를 입력: (종료:0) 7
		// 숫자를 입력: (종료:0) 1
		// 숫자를 입력: (종료:0) 0
		// 합계 : 13
		
		Scanner sc = new Scanner(System.in);
		int num;
		int total = 0;
		
		while(true) {
			System.out.print("숫자를 입력: (종료:0) ");
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			total += num;
		}
		System.out.printf("합계 : %d", total);
		sc.close();
	}
}
