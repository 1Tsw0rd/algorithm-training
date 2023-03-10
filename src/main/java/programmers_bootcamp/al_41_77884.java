package programmers_bootcamp;

public class al_41_77884 { //https://school.programmers.co.kr/learn/courses/30/lessons/77884
    public static void main(String[] args) {
        //약수(divisor) - 어떤 수를 나누어떨어지게하는 수 ex) 14 = 1, 2, 7,14

        //left ~ right까지 순차적으로 계산 필요 => for문 쓰자
        //약수 구하기 - 제곱근 이용 << 제곱근을 약수 구하기 작업의 최대값으로 활용 => Math.sqrt()
        //- 약수 중 최대값을 의미
        //- 소수점 없이 딱 나온 수는 1개 => 1개로 봐야됨 ex) 16 => 4
        //- 소수점 나오면 거기까지가 범위 => *2 적용 가능 ex) 15 => 3.8...
        //개수 카운터, 근데 이떄 개수가 짝수면 +, 홀수면 -

        int left = 13;
        int right = 17;
        int answer = 0;

        //1. 대상 숫자들 구하기
        //개수가 짝수면 +, 홀수면 -
        int i = left;

        for (; i <= right; i ++) {
            System.out.println(i);

            //사칙연산 + - 판별
            int plusOrMinus = 0;

            //2. 약수 구하기
            double divEnd = i;

            //약수 구하기 연산 최대값 판별
            divEnd = Math.sqrt(divEnd);
            double calcJudge = Math.floor(divEnd);

            //System.out.println("divEnd : " + divEnd + "calc : " + calcJudge);
            //if (divEnd == calcJudge) System.out.println("깉디 " + "divEnd : " + divEnd + "calc : " + calcJudge);

            //같다면 현재 값은 +1, 다르다면 +2로 계산
            for (int j = 1; j <= calcJudge; j++){
                if (i % calcJudge == 0) plusOrMinus += 2;
            }

            if (divEnd == calcJudge) plusOrMinus--;

            if (plusOrMinus % 2 == 0) answer += i;
            else answer -= i;
        }
        System.out.println(answer);
    }
}
