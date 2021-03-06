package com.kita.first.level2;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		// 다차원 배열
		// {1, 2, 3, 4, 5}
		// {{1, 2}, {1, 3}, {2, 3}}
		
		int[][] arr = new int[3][2];
		// {{0, 0}, {0, 0}, {0, 0}}
		arr[0][0] = 1; // {{1, 0}, {0, 0}, {0, 0}}
		arr[0][1] = 2; // {{1, 2}, {0, 0}, {0, 0}}
		arr[2][0] = 2; // {{1, 2}, {0, 0}, {2, 0}}
		
		// {{1, 1}, {1, 1}, {1, 1}}
		// {{1, 1, 1}, {1, 1, 1, 1}, {1, 1}}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 1; 
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
