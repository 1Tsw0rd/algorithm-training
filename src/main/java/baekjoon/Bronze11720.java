package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int res = 0;

        for (int i = 0; i < len; i++) {
            res += str.charAt(i) - '0'; //아스키 code '0' : 48, '1' : 49
        }

        //누적 더하기
        System.out.println(res);
    }
}
