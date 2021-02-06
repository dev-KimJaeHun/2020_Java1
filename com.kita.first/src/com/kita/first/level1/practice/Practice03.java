package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
//		수학 응시 유형을 입력해 주세요: (가/나)
//		점수를 입력해 주세요:
//			
//		가형 기준 : 60
//		나형 기준 : 70
//		
//		"평균 미만입니다."
//		"평균입니다."
//		"평균 초과입니다."
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수학 응시 유형을 입력해 주세요: (가/나)");
		String str = scan.next();
		System.out.println("점수를 입력해 주세요: ");
		int num = scan.nextInt();
		scan.close();
		
//		if("가".equals(str)) {
//			if(num < 60) {
//				System.out.println("평균 미만입니다.");
//			} else if(num == 60) {
//				System.out.println("평균입니다.");
//			} else if(num > 60) {
//				System.out.println("평균 초과입니다.");
//			} else if("나".equals(str)) {
//				if(num < 70) {
//					System.out.println("평균 미만입니다.");
//				} else if(num == 70) {
//					System.out.println("평균입니다.");
//				} else if(num > 70) {
//					System.out.println("평균 초과입니다.");
//				}
//			} 
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
		
		int avg = 0;
		
		if("가".equals(str)) {
			avg = 60;	
		} else if("나".equals(str)) {
			avg = 70;
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		if(avg == 0) {
			System.out.println("다시 입력해주세요");
		} else if(num < avg) {
			System.out.println("평균 미만입니다.");
		} else if(num > avg) {
			System.out.println("평균 초과입니다.");
		} else {
			System.out.println("평균입니다.");
		}
		
	}

}
