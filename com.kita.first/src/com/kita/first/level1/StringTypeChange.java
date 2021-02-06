package com.kita.first.level1;

public class StringTypeChange {
	// 문자형변환
	public static void main(String[] args) {
		int num = 3;
		String str = "안녕";
		
		String result1 = num + str;
		System.out.println(result1); // 3안녕
		
		String str2 = "123";
//		int result2 = (int)str2;
		int result2 = Integer.parseInt(str2); // 문자열로 정수로 변환
		
		String str3 = "2.3";
		double result3 = Double.parseDouble(str3); // 문자열 실수로 변환
		// result3 = Double.parseDouble("2.3");
		
		
		
	}

}
