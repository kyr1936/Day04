package com.yr.array2;

import java.util.Scanner;

public class Array_2_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 심판 5명
		// 점수는 int
		
		int[] points = new int[5];
		for (int i=0; i<points.length; i++) {
			System.out.println((1+i)+" 번 점수 입력");
			points[i] = sc.nextInt();
			
		}
		
		// 평균 구하기 - 제일 높은/낮은 점수 제외하고
		int max = points[0];
		int min = points[0];
		//int[] total = new int[3];
		
		for(int i=0; i<points.length; i++) {
			// 최대 점수 제외
			if(max<points[i]) {
				max=points[i];
			} // 최대 if문
			
			// 최소 점수 제외
			if(min > points[i]) {
				min=points[i];
			} // 최소  if문
			
		} // for문
		int total=0;
		for(int i=0; i<points.length; i++) {
			total = total+points[i];
		}
		
		double avg = (double)(total-max-min)/(points.length-2);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
