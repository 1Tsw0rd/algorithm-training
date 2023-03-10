package programmers_bootcamp;

public class al_7_76501 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/76501
        //absolutes에는 숫자 배열
        //signs에는 +(true), -(false) 부호
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};

        int answer = 0;

        for (int i = 0; i < signs.length; i++){
            if (signs[i]) { //true일 때 동작
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
            System.out.println(answer);
        }
        System.out.println(answer);
    }
}
