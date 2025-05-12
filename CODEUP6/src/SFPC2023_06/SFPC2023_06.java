package SFPC2023_06;

import java.util.Scanner;

public class SFPC2023_06 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. 쌀 180g, 육수 200ml, 쇠고기 육회 50g, 콩나물 40g, 고사리 50g, 도라지 30g, 달걀 1개, 각종 야채 및 양념을 준비한다.
		 * 2. 사골 육수에 쌀을 넣어 밥을 짓는다.
		 * 3. 쇠고기 육회를 준비한다.
		 * 4. 콩나물, 고사리, 도라지 나물을 준비한다.
		 * 5. 그릇에 밥을 담고 재료들을 고루 돌려 담은 후 고추장을 얹는다.
		 * 
		 * 전주비빔밥축제를 위해 준비된 콩나물의 양(a), 고사리의 양(b), 도라지의 양(c)이 주어질 때,
		 * 만들 수 있는 전주비빔밥의 최대 그릇 수를 계산해보자.
		 */
	
		Scanner sc = new Scanner(System.in);
		int abc = sc.nextInt();
		
		int[] material = new int[abc];
		int[] insert = new int[abc];
		
		for(int i = 0; i < abc; i++) {
			material[i] = sc.nextInt();
		}
		
		for(int i = 0; i < abc; i++) {
			insert[i] = sc. nextInt();
		}
		
		int min_dish = Integer.MAX_VALUE;
		
		for(int i = 0; i < abc; i++) {
			int max_dish = material[i]/insert[i];
			if(max_dish < min_dish) {
				min_dish = max_dish;
			}
		}
		
		System.out.println(min_dish);
	}	

}
