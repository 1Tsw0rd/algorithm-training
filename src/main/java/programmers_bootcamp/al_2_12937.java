package programmers_bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_2_12937 { //https://school.programmers.co.kr/learn/courses/30/lessons/12937
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if(num % 2 == 0) System.out.printf("Even");
        else System.out.println("Odd");
    }
}
