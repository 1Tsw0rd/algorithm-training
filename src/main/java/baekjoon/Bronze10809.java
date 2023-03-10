package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bronze10809 {
    public static void main(String[] args) throws IOException {
        //중복제거 X
        //필요한 값 : 알파벳 위치, 몇번째

        String str  = String.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder(); //빠른 출력을 위해 사용 장단점이 있겠지만 StringBuffer보다 빠르다 함

        int[] res = new int[26];
        Arrays.fill(res, -1); //한번에 초기화

        for (int i = 0; i < str.length(); i++) {
            int workChar = str.charAt(i);
            int idx = workChar - 97;

            if (res[idx] == -1) res[idx] = i;
        }

        sb.append(res[0]);

        for (int i = 1; i < res.length; i++) {
            sb.append(" " + res[i]);
        }

        System.out.print(sb);
    }
}
