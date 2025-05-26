package SFPC2023_08;

public class SFPC2023_08 {

	public static void main(String[] args) {
		/*
		 * 비버중학교의 오늘 급식 메뉴는 롱케이크이다. 학생들은 한 줄로 서서 자기 차례가 되면 학생들의 수만큼으로 자를 수 있는 케이크 1조각을 가져간다.
           학생들은 롱케이크에 올려진 과일 토핑을 보고 원하는 케이크 조각을 선택할 수 있다. 그 케이크 조각이 다른 부분과 연결되어 있는 경우에는 빵칼을 사용해서 잘라내야 한다. 그 조각의 위치 또는 좌우 상태에 따라 빵칼의 사용 횟수가 달라진다.
		   예를 들어, 6명의 학생 중 처음 3명의 학생이 차례대로 5번, 1번, 6번 위치의 케이크를 가져간다고 할 때 빵칼을 사용하는 횟수는 다음과 같다.

           5번 케이크의 좌우를 2번 자름
           1번 케이크의 오른쪽을 1번 자름
           6번 케이크 자르지 않음

           10명의 학생이 차례대로 줄 서 있고, 학생이 가져간 케이크의 번호가 차례대로 7, 4, 1, 10, 2, 3, 5, 6, 8, 9 일때, 빵칼을 1번 사용하는 학생의 수와 빵칼을 2번 사용하는 학생의 수를 구해보자.
		   빵칼을 1번 사용하는 학생의 수와 빵칼을 2번 사용하는 학생의 수를 스페이스를 사이에 두고 한 줄로 출력한다.
		 */
		
		int[] order = {7, 4, 1, 10, 2, 3, 5, 6, 8, 9};
		boolean[] cake = new boolean[11];
		
		int oneCut = 0;
		int twoCut = 0;
		
		for(int i = 0; i<order.length; i++) {
			int position = order[i];
			int cutCount = 0;
			
			if(position > 1 && cake[position - 1]) {
				cutCount++;
			}
			
			if(position < 10 && cake[position + 1]) {
				cutCount++;
			}
			
			cake[position] = true;
			
			if(cutCount == 1) {
				oneCut++;
			} else if(cutCount == 2) {
				twoCut++;
			}
			
		}

		System.out.println(oneCut + " " + twoCut);
	}

}
