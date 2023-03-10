package programmers_bootcamp;

import java.util.*;

public class al_14_12910 { //https://school.programmers.co.kr/learn/courses/30/lessons/12910
    public static void main(String[] args) {
        //자바 배열 오름차순 함수(작->큰) Arrays.sort()
        //자바 배열 내림차순 함수(큰->작) Arrays.sort(배열, Collections.reverseOrder())
        //자바 리스트 오름차순 정렬 Collections.sort()
        //내림차순 Collections.sort(리스트, Collections.reverseOrder());
        //일단 해당하는 값들 구하고, 정렬

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        List<Integer> answer = new ArrayList<>();
        int answerIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
                answerIndex++;
            }
        }

        if(answerIndex == 0) answer.add(-1);

        Collections.sort(answer);
        System.out.println(answer.toString());


    }
}
