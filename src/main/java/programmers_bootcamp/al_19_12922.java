package programmers_bootcamp;

public class al_19_12922 { //https://school.programmers.co.kr/learn/courses/30/lessons/12922
    public static void main(String[] args) {
        String answer ="";
        int n = 10;
        String waterMelon = "수박";

        int ck = n % 2;
        n /= 2;

        for (int i = 0; i <= n; i++){
            answer += waterMelon;
        }

        //삼항연산자 연습...
        answer = (ck == 0) ? answer.substring(0, answer.length()-2) : answer.substring(0, answer.length()-1);

        System.out.println(answer);
    }
}
