package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분수찾기 https://www.acmicpc.net/problem/1193
public class Bronze1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 1;
        int z = 0;

            for(int i = 1; z < num; i++){
                if (i % 2 == 0) {
                    x = x;
                    y += 1;
                    z++;
                } else {
                    x += 1;
                    y = y;
                    z++;
                }
                for(int j = 1; j <= i && z < num; j++){
                    if (i % 2 == 0 && y != 1) {
                        x += 1;
                        y -= 1;
                        z++;
                    } else if(i % 2 != 0 && x != 1){
                        x -= 1;
                        y += 1;
                        z++;
                    }
                }
            }
        System.out.printf("%d/%d\n",x,y);
    }
}