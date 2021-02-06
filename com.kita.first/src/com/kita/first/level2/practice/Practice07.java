package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
//		랜덤값 10~90을 맞추는 게임
//		UP / DOWN / Great!!
		int max = 90;
		int min = 10;
		Scanner sc = new Scanner(System.in);
		int r = (int)((Math.random() * max - min + 1) + min);
		
//		if(i == r) {
//			System.out.printf("Great!!: %d = %d", i, r);
//		} else if(i > r) {
//			System.out.printf("UP: %d > %d", i, r);
//		} else if(i < r) {
//			System.out.printf("DOWN: %d < %d", i, r);
//		} 
//		sc.close();
		
		while(true) {
			System.out.printf("숫자를 입력하세요. (%d ~ %d): ", min, max);
			int i = sc.nextInt();
			if(i > max || i < min) {
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				continue;
			}
			if(r > i) {
				System.out.println("UP");
			} else if(r < i) {
				System.out.println("DOWN");
			} else {
				sc.close();
				System.out.println("GREAT!!!");
				break;
			}
		}
		
		
	}
}
