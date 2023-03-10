package programmers_bootcamp;

public class al_15_70128 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/70128
        //나와있는 공식 적극 활용
        //배열 사이즈가 비교+계산 횟수이기에 활용
        //합계 값 담을 전용 값 필요
        int answer = 0;
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int count = a.length;

        for (int i = 0; i < count; i++){
            int tempValue = a[i]*b[i];
            answer += tempValue;
        }
        System.out.println(answer);

    }
}
