package programmers_bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_1_12969 { //https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=java
    public static void main(String[] args) throws IOException {
        //5별 크기, 3은 라인 수
        //입력 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int j = 0; j < b; j++){
            String star ="";
            for (int i = 0; i < a; i++){
                star += "*";
            }
            System.out.println(star);
        }
    }
}
