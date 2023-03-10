package programmers_bootcamp;

public class al_42_12928 { //https://school.programmers.co.kr/learn/courses/30/lessons/12928
    public static void main(String[] args) {
        //약수구하기 로직 응용, 합을 구하자
        //이 문제에서 변수는 0과 1이네..

        //그냥 해볼까

        int n = 5;
        int answer = 0;

        if (n < 2) answer = n;
        else {
            int sum = 0; //약수 합
            int workNum = 0; //약수 판별용
            int endNum = n / 2; //계산 줄이기(성능)

            for (int i = 1; i < endNum; i++) {
                workNum = n / i;
                endNum = workNum; //계산 줄이기(성능)
                if (n % i == 0 && workNum != i) {
                    sum += i;
                    sum += workNum;
                } else if(n % i ==0 && workNum == i){
                    sum += i;
                }
                System.out.println("workNum : " + workNum + " sum : " + sum + " endNum : " + endNum);
            }
            answer = sum;
        }


        System.out.println(answer);

    }
}
