package com.kita.first.level2.practice;

public class Practice14 {
	public static void main(String[] args) {
		// 성적 배열
		int[][] arr = {
				{67, 49, 87}, // 국어성적
				{89, 92, 56}, // 수학성적
				{76, 39, 12} // 영어성적
		};
		// 과목이름 배열
		String[] clsArr = {"국어","수학","영어"};
		// 각 과목 성적 합계 배열
		int[] sumArr = {0,0,0};
		int allsum = 0;
		double allavg = 0.0;
		
		// 국어합계 : ?, 평균: ? 00.0
		// 수학합계 : ?, 평균: ?
		// 영어합계 : ?, 평균: ?
		// 전체합계 : ?, 평균: ?
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				sumArr[i] += arr[i][j];
			}
		}
		for(int i=0; i<arr.length; i++) {
			allsum += sumArr[i];
			allavg = allsum / arr.length;
			System.out.printf("%s합계 : %d, 평균: %.1f\n", clsArr[i], sumArr[i], (double)sumArr[i]/arr.length);
		}
		System.out.printf("전체합계 : %d, 평균: %.1f\n", allsum, allavg);

	}
}
