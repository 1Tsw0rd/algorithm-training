package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1712 {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int a = Integer.parseInt(strs[0]);
    int b = Integer.parseInt(strs[1]);
    int c = Integer.parseInt(strs[2]);

    int profit = c-b; //0초과하면 이익 가능
    int bep;

        if (profit > 0) bep = (a/profit) + 1; //본전 + 1대판매 = 손익분기점 독파!
        else bep = -1;

        System.out.printf("%d", bep);
    }
}
