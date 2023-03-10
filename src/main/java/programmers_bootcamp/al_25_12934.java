package programmers_bootcamp;

public class al_25_12934 { //https://school.programmers.co.kr/learn/courses/30/lessons/12934
    public static void main(String[] args) {
        //n의 제곱했던 양의 정수 구하고 >> Math.sqrt(9); << 3나옴
        //그 정수 + 1해서 다시 제곱근해서 출력 >> Math.pow(5,2); << 5(대상)의 2제곱(지수)
        //만약 양의 정수 제곱이 아니라면 -1 리턴

        long n = 121L;
        long answer = 0;
        long tmpNum = (long) Math.sqrt(n);
        long ckNum = (long) Math.pow(tmpNum, 2);
        if (n == ckNum){
            tmpNum += 1;
            answer = (long) Math.pow(tmpNum,2);
        } else answer = -1;


        System.out.println(ckNum);
        System.out.println(tmpNum);
        System.out.println(answer);

    }
}
