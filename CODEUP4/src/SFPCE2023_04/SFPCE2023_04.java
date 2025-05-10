package SFPCE2023_04;

public class SFPCE2023_04 {

	public static void main(String[] args) {
		/* 전북특별자치도 임실군은 우리나라 최초로 치즈 공장이 설립되어 치즈 생상을 처음 시작한 곳이며,
		   치즈 만들기 등을 체험할 수 있는 임실치즈테마파크로도 유명하다.
		   테마파크에서 일하는 비버는 다음의 규칙에 따라 치즈 생산한다.
		   
		   생산조건
		   1kg의 치즈를 만들기 위해서는 10L의 우유가 필요하다.
		   젓소의 컨디션에 따라 한 마리의 젖소가 생산하는 우유의 양은 다음과 같다.
		   최상S = 25L, 보통A = 15L, 최하B = 10L
		   
		   우유를 남기지 않으면서 정확히 2024의 치즈를 생산하기 위해서는 필요한 젖소는 최소 몇 마리인지 구해보자.
		   각 컨디션의 젖소의 수는 무한히 많다고 가정한다.
		   
		   출력
		   정확히 n 의 치즈를 생산하기 위해서 필요한 젖소의 최소 마릿수를 출력한다
		*/
		int cheeze = 20240;
		int cows = Integer.MAX_VALUE;
		
		for(int cowB = 0; cowB <= cheeze / 10; cowB++) {
			
			for(int cowA = 0; cowA <= cheeze / 15; cowA++) {
				
				int milk = cowB * 10 + cowA * 15; // 지금까지 생산된 우유 양
				int result = cheeze - milk; // 남은 우유 양
				
				if(result >= 0 && result % 25 == 0) {
					int cowS = result / 25;
					
					int total = cowB + cowA + cowS;
					
					//현재 조합이 가장 적은 젖소 수인지 확인
					cows = Math.min(cows, total);
					
				}
			}
				
		}

		System.out.println(cows);
	}
	
// 배열로 푸는 방식	
//	int cheeze = 20240;
//	int[] milk = {10, 15, 25};
//	int[] cow = new int[cheeze + 1];
//	
//	for(int i = 1; i<=cheeze; i++) {
//		cow[i] = Integer.MAX_VALUE;
//	}
//	
//	for(int i = 0; i<=cheeze; i++) {
//		for(int y : milk) {
//			if (i + y <= cheeze && cow[i] != Integer.MAX_VALUE) {
//				cow[i+y] = Math.min(cow[i+y], cow[i]+1);
//			}
//		}
//	}
//	
//	System.out.println(cow[cheeze]);
	
}
