package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//설탕 배달 https://www.acmicpc.net/problem/2839
public class Silver2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sv = Integer.parseInt(br.readLine());
        int res = 0;

        if (sv != 4 && sv != 7) {
            //3kg봉지 구하기
            int[] pack3_arr = {0, 2, 4, 1, 3};
            int pack3_spot = sv % 5;
            int pack3 = pack3_arr[pack3_spot];

            //3kg봉지 뺀 나머지 설탕 용량
            sv = sv - (3 * pack3);

            //5kg봉지 구하기
            int pack5 = 0;
            if (sv % 5 == 0) {
                pack5 = sv / 5;
                res = pack5 + pack3;
            } else {
                res = -1;
            }
        } else {
            res = -1;
        }
        //결과
        System.out.println(res);
    }
}
