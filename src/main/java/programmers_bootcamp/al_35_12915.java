package programmers_bootcamp;

import java.util.Arrays;
import java.util.Comparator;

public class al_35_12915 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12915
    public static void main(String[] args) {
        //n자가 기준점
        //n위치의 글자가 동일할 경우 사전순

        //기준점으로 정렬해줄 녀석 필요 charAt
        //동일할 경우 정렬해주는 녀석 필요

        //배교대상1.compareTo(비교대상2)   https://mine-it-record.tistory.com/133
        //숫자의 비교 같은 경우는 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴해주는 반면
        //비교대상1 < 비교대상2 음수 반환
        //배교대상1 == 비교대상2 0 반환
        //비교대상1 > 비교대상2 양수 반환
        //문자열의 비교 같은 경우는 같다(0), 그 외 양수/음수값 같이 참 재미난 결과를 반환

        String[] strings = {"000","222","333","111","444", "555","666","777"};//{"abce","abcd","cdx"};
        int n = 1;//2
        String[] answer = {};
        Arrays.sort(strings, new Comparator<String>() { //오름차순
            @Override
            public int compare(String o1, String o2) {  //o1은 1인덱스부터, o2는 0인덱스부터 시작, 그런다음 졀라 다 검사하는 듯
                //System.out.println(o1 + " " + o2); //처음엔 o1:bed, o2:sun 순으로 들어옴
                //System.out.println(o1.charAt(n) + " " + o2.charAt(n));
                if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else if(o1.charAt(n) < o2.charAt(n)) return -1; //-1 내림차순 정렬(왼쪽이 크다면 오른쪽으로 보내줌
                                                                //예를 들어 인덱스 0이 크다면 오른쪽으로 인덱스 큰 쪽으로 이동...
                else return 1; //오름차순 정렬
            }
        });

        answer = strings;

        System.out.println(Arrays.toString(answer));
    }
}
