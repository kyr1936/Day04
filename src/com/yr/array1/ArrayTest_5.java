package com.yr.array1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 수 입력 3
		// 입력한 수 만큼 학생의 이름을 입력
		// 내가 입력한 학생 수 만큼 이름이 출력
		int num = 0;
		
		System.out.println("학생 수를 입력하세요");
		num = sc.nextInt();
		String[] std = new String[num];
		
		for(int i=0; i<std.length; i++) {
			System.out.println("학생의 이름을 입력하세요.");
			std[i] = sc.next();
		} 
//		for(int i=0; i<std.length; i++) {
//			System.out.println(std[i]);
//
//		}		
		
		// 학생 수 만큼 국어 점수 입력
		// 1번 학생의 국어 점수 입력 
		// 2번 학생의 국어 점수 입력 . . .
		// name : 82 ....
		
		// 수학 점수 입력
		// 국어점수 반 평균 / 수학점수 반 평균
		
	
		int [] kor = new int[std.length];
		int [] math = new int[std.length];
		
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i]+ " 의 국어 점수를 입력하세요.");
			kor[i] = sc.nextInt();
		}
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i] + " 의 수학 점수를 입력하세요");
			math[i] = sc.nextInt();
		} 
		
		int kTotal = 0;
		int mTotal = 0;
		
		for(int i=0; i<std.length; i++) {
			kTotal = kTotal + kor[i];
			mTotal = mTotal + math[i];
		}
		
		System.out.println("국어점수 반 평균 : " + kTotal/std.length);
		System.out.println("수학점수 반 평균 : " + mTotal/std.length);
		
		
		
		
		
		
		

	}

}
