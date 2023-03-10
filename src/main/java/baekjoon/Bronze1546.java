package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        double sum = 0;
        double max = 0;
        for (int i = 0; i < count; i++) {
            double now = Integer.parseInt(strs[i]);
            if (max < now) max = now;
            sum += now;
        }

        double res = (sum * 100 / max) / count;

        System.out.println(res);
    }
}
