package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int v = Integer.parseInt(strs[2]);

//        ((V-A)/(A-B)) 나머지가 0 이면 몫 + 1
//        나머지가 0이 아니면 몫 +2

        int res = (v-a)/(a-b);
        int mod_val = (v-a)%(a-b);

        if(mod_val == 0) res += 1;
        else res += 2;

        System.out.printf("%d", res);
    }
}