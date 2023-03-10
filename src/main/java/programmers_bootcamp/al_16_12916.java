package programmers_bootcamp;

public class al_16_12916 { //https://school.programmers.co.kr/learn/courses/30/lessons/12916
    public static void main(String[] args) {
        //p와 y 대소문자 없이 각각 갯수 추출 -> 비교 후 결과 반환(p와 y의 개수가 같으면 true 그렇지 않으면 false)
        //대소문자 문제는 전부다 소문자로 만들어 진행
        //toUpperCase() 소문자 -> 대문자 / toLowerCase() 대문자 -> 소문자
        //toCharArray() 문자열을 문자 배열로 변환

        boolean answer = true;

        String s = "pPoooY";
        char[] charArr = s.toLowerCase().toCharArray();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] == 'p') pCount++;
            else if (charArr[i] == 'y') yCount++;
        }

        if (pCount != yCount) answer = false;

        System.out.println(answer);
    }
}
