import java.util.Scanner;

public class SFPC2023_07 {
    /* SFPC2023_2364 고추장비빔밥1
     * 최고품질의 순창 고추 5kg을 이용하면
     * 한 항아리를 가득 채운 순창 고추장을 만들어 150,000원에 판매할 수 있다.
     * 
     * 5kg 미만의 고추로도 고추장을 만들어서 항아리에 담을 수는 있지만 용량이 부족하여 판매할 수는 없다.
     * 
     * 순창 고추장의 양(n kg)이 주어질 때, 순창 고추장이 담긴 항아리 개수와 총 판매금액을 계산해보자.
     * 
     */

    public static void main(String[] args) throws Exception {

        int base = 5;
        int price = 150000;


        Scanner sc = new Scanner(System.in);
        int abc = sc.nextInt();
        int hangari = abc / base;
        int count = hangari * price;

        System.out.println(hangari + " " + count);



       
    }
}
