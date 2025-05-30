package SFPC2023_03;

public class SFPC2023_03 {

	public static void main(String[] args) {
		/*
		 * 비버 고등학교 학생들이 전북특별자치도 군산시로 2박 3일의 수학여행을 갔다. 선생님은 스탬프투어 시간 동안 군산의 관광지 중에서 학생이
		 * 원하는 관광지를 관람하고 스탬프를 받아오는 학생들에게 특별한 기념품을 주기로 하였다. 어떤 관광지에서 스탬프를 받기 위해서는 일정 시간
		 * 동안 관람해야 한다.
		 * 
		 * 전체 관광지 수는 5개이고, 선생님이 정해준 관광지는 3개, 학생들의 수는 10명, 스탬프투어 시간은 100이다. 다른 장소로 이동될때
		 * 5분이 걸림 숙소에서 출발해서 숙소로 다시 돌아와야함 각 관광지의 관람시간은 1번 관광지 30분, 2번 관광지 25분, 3번 관광지
		 * 20분, 4번 관광지 30분, 5번 관광지 35분이다. 10명의 학생의 관광지 관람 순서가 다음과 같이 주어질때, 기념품을 받는 학생의
		 * 수를 구해보자.
		 * 
		 * 학생번호 1 3번(20분) -> 5번(35분) -> 2번(25분) = 80 20 100
		 * 학생번호 2 2번(25분) -> 3번(20분) -> 5번(35분) = 80 20 100
		 * 학생번호 3 5번(35분) -> 2번(25분) -> 3번(20분) = 80 20 100
		 * 학생번호 4 5번(35분) -> 2번(25분) -> 1번(30분) = 90 20 110
		 * 학생번호 5 2번(25분) -> 5번(35분) -> 1번(30분) = 90 20 110
		 * 학생번호 6 5번(35분) -> 2번(25분) -> 1번(30분) = 90 20 110
		 * 학생번호 7 3번(20분) -> 2번(25분) -> 1번(30분) = 75 20 95
		 * 학생번호 8 4번(30분) -> 1번(30분) -> 3번(20분) = 80 20 100
		 * 학생번호 9 3번(20분) -> 4번(30분) -> 5번(35분) = 85 20 105
		 * 학생번호 10 1번(30분) -> 2번(25분) -> 4번(30분) = 85 20 105
		 * 
		 * student [0][0] = 3; tour[3] = 20;
		 * student [0][1] = 5; tour[5] = 35;
		 * student [0][2] = 2; tour[2] = 25;
		 */

		 int[] tour = {0, 30, 25, 20, 30, 35};
		 int[][] student = {{3,5,2}, {2,3,5}, {5,2,3}, {5,2,1}, {2,5,1}, {5,2,1},
				 			{3,2,1}, {4,1,3}, {3,4,5}, {1,2,4}};
		 int goal = 0;
		 
		 int visit = 3;
		 int maxTime = 100;
		 int moveTime = 20;
		 
		 for(int i = 0; i < student.length; i++) {
			 int total = 0;
			 
			 for(int y = 0; y < visit; y++) {
				 total += tour[student[i][y]];
			 }
			 
			 total += moveTime;
		 
			 if (total <= maxTime) {
				 goal ++;
			 }
		 
		 }
		 
		 System.out.println(goal);
	}

}
