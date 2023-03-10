package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fac(n));
    }

    public static int fac(int n) {
        int y = n - 1; // y는 5 -> 4
        if (y > 0) n = fac(y);
        else {
            y = 0;
            n = 1;
        }
        System.out.println("y : " + y + " n: " + n);
        return (y + 1) * n; //n * y => 5 * 4
    }

//팩토리얼 처음
//n! 팩토리얼 함수의미
//ex)
//5!
//1*2*3*4*5
//
//근데 굳이 -> 이렇게 계산해야 됨?
//
//<- 가도 되자나
//이렇게 풀면 안되었다 함수가 함수를 부르면서
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int res = 1;
//
//        if (n != 0) {
//            for (; n > 0; n--) {
//                res = res * n;
//            }
//        }
//        System.out.println(res);

}
