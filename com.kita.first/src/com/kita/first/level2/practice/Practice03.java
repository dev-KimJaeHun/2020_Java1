package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
		// 2 ~ 9단 찍기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 9 * 9 = 81
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				int gu = i * j;
//				System.out.printf("%d * %d = %d\n", i, j, gu);
//			}
//		}
		// 가로로 찍기
		// 2 * 1 = 2	2 * 2 = 4 ... 2 * 9 = 18
		// ...
		// 9 * 1 = 9	9 * 2 = 18 ... 9 * 9 = 81
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				int gu = i * j;
				System.out.printf("%d * %d = %d\t", i, j, gu);
			}
			System.out.println();
		}
	}
}
