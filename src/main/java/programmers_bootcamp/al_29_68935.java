package programmers_bootcamp;

public class al_29_68935 { //https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public static void main(String[] args) {
        /* 10진수 -> 3진수 -> 위치 반전 -> 10진수
        * 3진수 변환 필요
        * 10진수 변환 필요
        * 위치 반전 필요
        *
        * https://velog.io/@kimmjieun/Java-%EC%A7%84%EB%B2%95-%EB%B3%80%ED%99%98-%EC%A0%95%EB%A6%AC
        * 10진수 -> n진수  Integer.toString(대상, n), 2진수의 경우 옆에 방식 말고도 Integer.toBinaryString(a)
        * n진수 -> 10진수 Integer.parseInt(대상, n)
        *
        *StringBuilder 문자열 캐시 사용하고 reverse() 사용
        *   StringBuilder sb = new StringBuilder(workNum);
        *   String reverse = sb.reverse().toString();
        *
        * */

        int n = 125;
        int answer = 0;

        String workNum = Integer.toString(n, 3);
        System.out.println(workNum);

        StringBuilder sb = new StringBuilder(workNum);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);

        answer = Integer.parseInt(reverse, 3);




        System.out.println(answer);


    }
}
