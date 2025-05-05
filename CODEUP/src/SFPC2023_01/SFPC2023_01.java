package SFPC2023_01;

public class SFPC2023_01 {

	public static void main(String[] args) {
		/*
		 * 전북특별자치도 전주시의 한옥마을에서는 가을마다 전주비빔밥축제가 열린다.
		 * 전주비빔밥은 우리나라 최대의 곡창지대인 호남평야와 전북특별자치도에서 생산된 영양 많고 신선한 쌀과 고기, 각종 채소와 고추장 등을 이용한 특별한 음식으로 국내를 넘어 해외에서도 주목을 받고 있다.
		 * 다음은 전주비빔밥축제를 준비하게 위해 전주비빔밥을 만드는 레시피 중 하나이다.
		 * 
		 * 1. 쌀 180g, 육수 200ml, 쇠고기 육회 50g, 콩나물 40g, 고사리 50g, 도라지 30g, 달걀 1개, 각종 야채 및 양념을 준비한다.
		 * 2. 사골 육수에 쌀을 넣어 밥을 짓는다.
		 * 3. 쇠고기 육회를 준비한다.
		 * 4. 콩나물, 고사리, 도라지 나물을 준비한다.
		 * 5. 그릇에 밥을 담고 재료들을 고루 돌려 담은 후 고추장을 얹는다.
		 * 
		 * 전주비빔밥축제를 위해 콩나물은 21,064, 고사리는 22,054, 도라지는 23,063이 준비되어 있을 때,
		 * 만들 수 있는 전주비빔밥의 최대 그릇 수를 계산해보자. 단, 다른 재료들은 충분히 많이 준비되어 있다.
		 */
		int[] total = {21064, 22054, 23063};
		int[] insert = {40, 50, 30};
		
		int[] max_dish = new int[total.length];
		for(int i = 0; i < total.length; i++) {
			max_dish[i] = total[i]/insert[i];
		}
		//max_dish = {526, 441, 768}
		
		int min_dish = max_dish[0];
		//최소값을 비교하기 위해 첫번째 값을 선택
		for(int i = 1; i < max_dish.length; i++) {
			if(max_dish[i] < min_dish) {
				min_dish = max_dish[i];
			}
		}
		//max_dish를 돌면서 가장 작은 값 441 저장
		
		System.out.println("최대 만들 수 있는 전주비빔밥 수 : " + min_dish + "그릇");

	}	
		//첫 문제 풀이
		//	int congnamul = 21064;
		//	int gosari = 22054;
		//	int dorazi = 23063;
		//	
		//	int insert_congnamul = 40;
		//	int insert_gosari = 50;
		//	int insert_dorazi = 30;
		//	
		//	int max_congnamul = congnamul / insert_congnamul; 	//전주비빔밥 만들때 들어가는 콩나물
		//	int max_gosari = congnamul / insert_gosari; 		//전주비빔밥 만들때 들어가는 고사리
		//	int max_dorazi = congnamul / insert_dorazi;			//전주비빔밥 만들때 들어가는 도라지
		//	
		//	int max_dish = Math.min(Math.min(max_congnamul, max_gosari), max_dorazi);
		//	
		//	System.out.println("최대 만들 수 있는 전주비빔밥 수 : " + max_dish + "그릇");

}
