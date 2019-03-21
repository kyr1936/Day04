package com.yr.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
		// 정수 3개 모을 배열 선언
		
		Scanner sc = new Scanner(System.in);
		// 숫자를 입력한 만큼 배열이 만들어짐
		System.out.println("배열의 크기를 입력");
		int i = sc.nextInt();
		int[] ar = new int[i];
		
		// 배열 생성 시 , 이미 데이터가 있는 경우
		int [] ar2 = {10, 20, 30}; // 세 칸 짜리 배열
		System.out.println("검색할 번호를 입력하세요");
		i = sc.nextInt();
		System.out.println(ar2[i]); // 1 입력하면 20, 0은 10, 2는 30
		 
		// length - 자기 배열의 크기(칸 수) size
		System.out.println(ar.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
