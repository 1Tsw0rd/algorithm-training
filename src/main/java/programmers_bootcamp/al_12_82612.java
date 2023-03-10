package programmers_bootcamp;

public class al_12_82612 { //https://programmers.co.kr/learn/courses/30/lessons/82612
    public static void main(String[] args) {
        int price = 3; //수수료 계속 +되는 값
        int money = 30; //가진 돈.. 점점 줄어듬
        int count = 4; //놀이공원 탑승 횟수.. *되는 값
        long answer = 0;

        if (price >= 1 && price <= 2500) {
            if (money >= 1 && money <= 1000000000) {
                if (count >= 1 && count <= 2500) {
                    long priceSum = 0; //int범위 넘어가기에
                    long susu = price;

                    for (int i = 0; i < count; i++) {
                        priceSum += susu;
                        susu += price;
                    }
                    System.out.println(susu);
                    System.out.println(priceSum);
                    System.out.println(money);

                    if (money < priceSum) answer = (priceSum - money);
                }
            }
        }

        System.out.println(answer);
    }
}
