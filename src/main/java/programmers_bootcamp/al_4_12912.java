package programmers_bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_4_12912 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12912
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        Long sum = Long.valueOf(0);
        int big = 0;
        int small = 0;

        if (a >= b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for (int i = small; i <= big; i++) {
            sum += i;
            //System.out.println("sum : " + sum + "i : " + i);
        }
        System.out.println(sum);
    }
}
