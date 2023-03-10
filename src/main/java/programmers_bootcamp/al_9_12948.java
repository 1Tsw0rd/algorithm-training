package programmers_bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_9_12948 { //https://school.programmers.co.kr/learn/courses/30/lessons/12948
    public static void main(String[] args) throws IOException {
        //마지막 4자리는 공개, 나머지 *
        //갯수 구해서 -4는 substring으로 출력
        //나머지는 length함수 이용 *로 찍기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phone_number = br.readLine();
        String answer = "";

        int starSize = phone_number.length() - 4;
        int phone_numberSize = phone_number.length();

        for (int i =0; i < starSize; i++){
            answer +="*";
        }
        answer += phone_number.substring(starSize, phone_numberSize);

        System.out.println(answer);
    }
}
