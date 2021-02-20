package com.kita.first.level2.practice;

import java.util.Arrays;

public class Practice13 {
	public static void main(String[] args) {
		int [][] arr = new int[5][3];
		int l = 1;
		// {{1,2,3},{4,5,6}, ... ,{13,14,15}}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = l++;
			}	
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
