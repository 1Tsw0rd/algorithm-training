package programmers_bootcamp;

import java.util.regex.Pattern;

public class al_17_12918 {  //https://programmers.co.kr/learn/courses/30/lessons/12918
    public static void main(String[] args) {
        //문자열이 숫자로만 이뤄져야 true
        //문자 및 숫자 판별 필요 -> Character.isDigit() 함수 : 숫자면 true, 아니면 false
        //정규식 활용 "^[0-9]*$";
        //문자열은 문자 배열로 ㄱㄱ 12916 메모참고
        //문자열 길이 4 또는 6

        boolean answer = false;
        String s = "sdfdfs";

        String pattern = "^[0-9]*$"; //숫자 정규식

        if (s.length() == 4 || s.length() == 6){
            answer = Pattern.matches(pattern, s); //숫자만 있다면 true
        }

        System.out.println(answer);
    }
}
