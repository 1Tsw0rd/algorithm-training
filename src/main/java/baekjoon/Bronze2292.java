package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//벌집 https://www.acmicpc.net/problem/2292
public class Bronze2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sv = Integer.parseInt(br.readLine());
        int res = 0;
        int x = 0;
        int y = 1;

        //이전값 중 최대값값 < 입력값 = 큰값(6의 배수 만큼 증가)
        for (int i = 1; res == 0; i++) {
            if (x < sv && sv <= y) {
                res = i;
            } else {
                x = y;
                y = y + (6 * i);
            }
        }
        System.out.println(res);
    }
}