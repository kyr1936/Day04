package com.yr.array1;

import java.util.Scanner;

public class ArrayTest_4 {

	public static void main(String[] args) {
		int [] ar = {1, 3, 5};
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		Scanner sc = new Scanner(System.in);
		int[] ar2 = new int[3];
		
		for(int i=0; i<ar2.length; i++) {
			System.out.println("번호를 입력하세요");
			ar2[i] = sc.nextInt();
			
		}
		

		
		
		

	}

}
