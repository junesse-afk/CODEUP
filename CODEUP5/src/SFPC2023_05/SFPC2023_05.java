package SFPC2023_05;

import java.util.Scanner;

public class SFPC2023_05 {
		
	public static void main(String[] args) {
		/*
		 * 특산물 : 김제 백구포도, 군산 박대, 고창 복분자, 남원 목공예품, 무주 천마, 부안 오디, 순창 고추장, 완주 곶감, 익산 고구마,
		 * 임실 치즈, 장수 한우, 전주 탁주, 정읍 쌍화차, 진안 홍삼
		 * 전북특별자치도의 특산물 중 서로 다른 3개의 특산물을 선택하여 나만의 선물세트를 만들어 친구들에게 선물하려고 한다.
		 * 
		 * 특산물 가짓수(n)와 각 특산물의 가격(pi), 선물할 친구의 수(m)와 특산물 구입에 사용할 수 있는 금액(k)이 주어질 때,
		 * 선물세트를 만들 수 있는 방법의 수를 계산해보자. */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		
		int[] pi = new int[n];
		for(int i = 0; i < n; i++) {
			pi[i] = sc.nextInt();
			
		}
		
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 0; i < n-2; i++) {
			for(int y = i + 1; y < n-1; y++) {
				for(int x = y + 1; x < n; x++) {
					int sum = pi[i]+pi[y]+pi[x];
					if(sum <= k) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
