package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver11659 {
    public static void main(String[] args) throws IOException {
        //숫자 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int numCnt = Integer.parseInt(st.nextToken());
        int qCnt = Integer.parseInt(st.nextToken());

        //데이터입력
        st = new StringTokenizer(br.readLine());

        //숫자 준비
        int sum[] = new int[numCnt + 1];

        sum[0] = 0;

        for (int i = 1; i <= numCnt; i++) {
            sum[i] = Integer.parseInt(st.nextToken()) + sum[i - 1];
        }


        for (int i = 0; i < qCnt; i++) {
            //질의
            st = new StringTokenizer(br.readLine());
            int indexMin = Integer.parseInt(st.nextToken());
            int indexMax = Integer.parseInt(st.nextToken());

            //출력
            sb.append(sum[indexMax] - sum[indexMin - 1] + "\n");
        }
        System.out.println(sb);
    }
}


