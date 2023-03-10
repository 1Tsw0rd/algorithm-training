package programmers_bootcamp;

import java.util.HashMap;

public class al_38_81301 { //https://school.programmers.co.kr/learn/courses/30/lessons/81301
    public static void main(String[] args) {
        //숫자와 영어 표현 담을 배열 필요
        // 배열의 녀석 찾으면 대조해서 바꿀 녀석 필요 => HashMap쓰자
        //영문자 찾고 -> 숫자로 변환 필요 => contains 대신에 replace로 해결하고자 함

        String s = "one4seveneight";
        int answer = 0;

        String[] strNumArr = {"zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };


        HashMap<String, Integer> strNumHs = new HashMap<>();
        strNumHs.put("zero", 0);
        strNumHs.put("one", 1);
        strNumHs.put("two", 2);
        strNumHs.put("three", 3);
        strNumHs.put("four", 4);
        strNumHs.put("five", 5);
        strNumHs.put("six", 6);
        strNumHs.put("seven", 7);
        strNumHs.put("eight", 8);
        strNumHs.put("nine", 9);

        System.out.println(strNumHs.get("one"));

        for (String s1 : strNumArr) {
            s = s.replace(s1, strNumHs.get(s1).toString());
        }

        System.out.println(s);
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
