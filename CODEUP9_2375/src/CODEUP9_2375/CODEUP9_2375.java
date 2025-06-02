package CODEUP9_2375;

import java.util.Scanner;

public class CODEUP9_2375 {

	public static void main(String[] args) {
		// https://github.com/junesse-afk/CODEUP/blob/main/CODEUP3/src/SFPC2023_03/SFPC2023_03.java 
		// 전체 관광지 수(n)와 선생님이 정해준 관광지 수(m), 학생들의 수(k)와 스탬프투어 시간(t),
		// 전체 관광지 중 i번 관광지의 관람 시간(ai), 각 학생들의 관광지 관람 순서(b1 ~ bm)가 주어질 때, 기념품을 받는 학생의 수를 구해보자.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //전체 관광지 수(n)
		int m = sc.nextInt(); //선생님이 정해준 관광지 수(m)
		int k = sc.nextInt(); //학생들의 수(k)
		int t = sc.nextInt(); //스탬프투어 시간(t)
		
		int[] a = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			
			a[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for(int stu = 0; stu < k; stu++) {
			
			int total = 0;
			
			for(int y = 0; y < m; y++) {
				
				int place = sc.nextInt();
				
				total += a[place];
			}
			
			if (total <= t) {
				
				result++;
			}
		}
		
		System.out.println(result);

	}

}
