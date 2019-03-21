package com.yr.array1;

import java.util.Scanner;

public class ArrayTest_6 {	
	
	public static void main(String[] args) {
		// 1. 학생 등록  - 학생 수 만큼 / 한 학생의 정보 한꺼번에 입력
		//		학생 수를 입력하세요.
		// 		학생 번호를 입력하세요.
		// 		학생 이름을 입력
		//		국어 점수 입력
		//		수학 점수 입력
		//		영어 점수 입력
		// 2. 전체정보 조회
		//		번호, 이름, 국어, 수학, 영어
		// 3. 학생정보 검색
		//		검색할 학생의 번호를 입력 - 그 학생의 정보만 출력
		// 4. 프로그램 종료 -> 123 반복
		
		Scanner sc = new Scanner(System.in);
		int select=0; // 번호 선택
		int select2=0;
		int count =0;
		int[] num = null; // 학생 번호 배열
		String[] std = null; // 학생 이름 배열
		int[] kor = null; // 국어 점수 배열
		int[] math = null; // 국어 점수 배열
		int[] eng = null; // 국어 점수 배열
		
		
		while(true) {
		System.out.println("번호를 입력하세요.");
		System.out.println("1. 학생 등록  2. 전체 정보 조회  3. 학생 정보 검색  4. 프로그램 종료");
		select = sc.nextInt();
		
		// 학생 등록
		if(select==1) {
			System.out.println("학생 수를 입력하세요.");
			count = sc.nextInt();
			num = new int[count];
			std = new String[count];
			kor = new int[count];
			math = new int[count];
			eng = new int[count];
			
			
			for(int i=0; i<num.length; i++) {
				System.out.println("학생 번호를 입력하세요.");
					num[i] = sc.nextInt();	
				System.out.println("학생 이름을 입력하세요.");
					std[i] = sc.next();
				System.out.println("국어 점수를 입력하세요.");
					kor[i] = sc.nextInt();	
				System.out.println("수학 점수를 입력하세요.");
					math[i] = sc.nextInt();
				System.out.println("영어 점수를 입력하세요.");
					eng[i] = sc.nextInt();
				System.out.println(num[i] + " 번 학생이 등록되었습니다.");
				System.out.println("=======================");
			} // 학생 등록 ~for문
		} // 등록  if문
		if(select==2) {
			System.out.println("전체 정보를 조회합니다.");
			for(int i=0; i<num.length; i++) {
			System.out.println("* 학생 번호 : " + num[i] + ", 학생 이름 : " + std[i] + ", 국어 점수 : " + kor[i]
														+ ", 수학 점수 : " + kor[i] + ", 영어 점수 : " + kor[i]);
			}
		}   // 전체 조회 if문
		if(select==3) {
			System.out.println("검색할 학생의 번호를 입력하세요.");
			select = sc.nextInt();
			for(int i=0; i<num.length; i++) {
				if(i==select2) { 
					System.out.println("* 학생 번호 : " + num[i] + ", 학생 이름 : " + std[i] + ", 국어 점수 : " + kor[i]
										+ ", 수학 점수 : " + kor[i] + ", 영어 점수 : " + kor[i]);
				}   // 검색할 정보 if문
			} // for문
		} // 학생 정보 검색 if문
		
		if(select==4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}  // 종료 if문
		
		
		} // 번호 선택 while문
		
		
	}

}
