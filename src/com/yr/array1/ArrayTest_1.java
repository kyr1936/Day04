package com.yr.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {
		// 배열
		// 여러 데이터의 묶음
		// 하나의 변수로 여러 개의 데이터를 다루고자 할 때 사용
		// 같은 데이터 타입만 묶을 수 있음
		// 배열 생성 시 몇 개를 만들지를 미리 명시
		// 만들어진 배열의 크기는 수정 불가
		
		int a = 10;
		int b = 20;
		// 메모리 영역
		// static, stack, heap
		
		// 배열 선언
		// 모을데이터타입 변수명 [] ;
		// 모을데이터타입[] 변수명;
		
		// 정수형 데이터 
		int [] ar = new int[3];		// heap에 생성
		System.out.println(ar);
		ar[0] = 'a';
		ar[1] = 20;    // 인덱스 번호 사용 0, 1, 2 , ...
		ar[2] = (int)3.2;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		// 문자 5개를 담을 배열 선언
		// 각 각 문자를 입력하고 출력
		
		char [] ch = new char[5];
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		ch[3] = 'D';
		ch[4] = 'E';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
		
		int[] num; // 변수 선언 - 지역변수
		num = new int[3]; // 지역변수는 사용자가 초기화를 해야만 사용 가능
		System.out.println(num);
		System.out.println(num[0]);  // 자동으로 초기화. 
									//선언된 데이터타입의 가장 기본 값이 나옴 int:0 double:0.0,string:null ...
		
		String name = "abc";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		Scanner [] scs = new Scanner[3];
		scs[0] = sc;
		scs[1] = sc2;
		scs[2] = sc3;
		
		scs[0].nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
