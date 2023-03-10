package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bronze10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> fiboNum = new ArrayList<>();
        fiboNum.add(0);
        fiboNum.add(1);
        System.out.println(fibo(n, fiboNum));
    }

    public static int fibo(int c, ArrayList<Integer> fiboNum) {
        //예전값 지금값
        int x = fiboNum.get(0);
        int y = fiboNum.get(1);
        int z = x + y;

        System.out.println(" c : " + c + " x : " + x + " y : " + y + " z : " + z);

        fiboNum.clear();
        fiboNum.add(y);
        fiboNum.add(z);

        if(c>2)  z = fibo(c-1, fiboNum);
        else if (c < 2 )return c;

        return z;
    }
}





// 피보나치 처음
//        int a = 0; //이전
//        int b = 1; //합친
//        int c = 0;
//        for (int i = 0; i < n; i++) {
//            a = b;
//            b = c;
//            c = a + b;
//        }
//        System.out.println(c);
