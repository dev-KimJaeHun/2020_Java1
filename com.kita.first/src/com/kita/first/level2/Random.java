package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n = Math.random(); // 0~0.99999999999999
						// 0 <= n < 1
		System.out.println("n: " + n);
		
		// 1~10
		int n2 = (int)(Math.random() * 10 + 1);
		System.out.println("n2: " + n2);
		
		// 1~5
		int n3 = (int)(Math.random() * 5 + 1);
		System.out.println("n3: " + n3);
		
		// 2~13
		int n4 = (int)(Math.random() * 13 + 2);
		                          // 최대값  최소값
		System.out.println("n4: " + n4);
		
		// 17~51 -> 17 <= x < 51
		int n5 = (int)(Math.random() * 51 + 17);
		System.out.println("n5: " + n5);
		
		int max = 51;
		int min = 17;
		int rNum = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(rNum);
	}

}
