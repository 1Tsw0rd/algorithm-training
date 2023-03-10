package programmers_bootcamp;

public class al_47_87389 {  //https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=java
    public static void main(String[] args) {
        // int n = 1000000;
        int answer = 0;
        int answer2 = 0;

        //법칙
        //아니면 땡겨서 2 => 3 => 2 -> n-1 => 2 => n-1
        //6으로 나누어 떨어지는 수가 순서번호

        for (int n = 3; n <= 170; n++) {


            n--;
            int workNum = n % 6;

            switch (workNum) {
                case 2:
                    answer = 2;
                    break;
                case 3:
                    answer = 3;
                    break;
                case 4:
                    answer = 2;
                    break;
                case 5:
                    answer = n;
                    break;
                case 0:
                    answer = 2;
                    break;
                case 1:
                    double c1 = Math.sqrt(n);
                    double c2 = Math.pow(c1, 2);
                    if (n != c2) answer = n;  //소수 처리 필요
                    else answer = (int) c1;
                    break;
            }

            double sqrtNum = Math.sqrt(n);

            if (sqrtNum == (int) sqrtNum) answer2 = (int) sqrtNum;
            else {
                for (int i = 2; i <= n; i++) {
                    int checkNum = n % i;
                    if (checkNum == 0) {
                        answer2 = i;
                        break;
                    }
                }
            }

            n++;
            if (answer != answer2) {
                System.out.println("n : " + n + " answer : " + answer + " answer2 : " + answer2);
                //System.out.println(" n(" + n + ") %" + " 6 = " + ((n-1) % 6));
                answer = Math.min(answer, answer2);
            }

        }
        System.out.println(answer);
    }
}

// int n = 12;
//        int answer = 0;
//
//        //n -  1 = 나온값 => 제곱근 활용해서 풀어봄
//        n -= 1;
//
//        double sqrtNum = Math.sqrt(n);
//
//        if (sqrtNum == (int) sqrtNum) answer = (int) sqrtNum;
//        else {
//            for (int i = 2; i <= n; i++) {
//                int checkNum = n % i;
//                if (checkNum == 0) {
//                    answer = i;
//                    break;
//                }
//            }
//        }
//        System.out.println(answer)