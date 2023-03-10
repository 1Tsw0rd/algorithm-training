package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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

//String[] oldArr = {"java", "C", "python"};
//String[] newArr = new String[5];

//Long[] oldArr = {1L, 2L, 3L};
//Long[] newArr = new Long[5];

//        List<Long> oldArr = new ArrayList<>();
//        oldArr.add(1L);
//        oldArr.add(2L);
//        oldArr.add(3L);
//
//        List<Long> newArr = new ArrayList<>();
//
//        newArr.addAll(oldArr);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("oldArr[" + i + "] : " + System.identityHashCode(oldArr.get(i)));
//            System.out.println("newArr[" + i + "] : " + System.identityHashCode(newArr.get(i)) + "\n");
//        }
//
//        oldArr.set(0, 7L);
//        System.out.println("oldArr[0] : " + oldArr.get(0));
//        System.out.println("newArr[0] : " + newArr.get(0) + "\n");
//
//        System.out.println("oldArr[0] 주소 : " + System.identityHashCode(oldArr.get(0)));
//        System.out.println("newArr[0] 주소 : " + System.identityHashCode(newArr.get(0) + "\n"));
//
//        System.out.println("<<<< 새로운 시작 >>>>");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("oldArr[" + i + "] : " + System.identityHashCode(oldArr.get(i)));
//            System.out.println("newArr[" + i + "] : " + System.identityHashCode(newArr.get(i)) + "\n");
//        }


//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> fiboNum = new ArrayList<>();
//        fiboNum.add(0);
//        fiboNum.add(1);
//        System.out.println(fibo(n, fiboNum));
//    }
//
//    public static int fibo(int c, ArrayList<Integer> fiboNum) {
//        //예전값 지금값
//        int x = fiboNum.get(0);
//        int y = fiboNum.get(1);
//        int z = x + y;
//
//        System.out.println(" c : " + c + " x : " + x + " y : " + y + " z : " + z);
//
//        fiboNum.clear();
//        fiboNum.add(y);
//        fiboNum.add(z);
//
//        if(c>2)  z = fibo(c-1, fiboNum);
//        else if (c < 2 )return c;
//
//        return z;
//    }

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


//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int arraySize = Integer.parseInt(br.readLine()); //입력값 개수
//
//        List<Integer> queue = new ArrayList<>(); //가변길이 ArrayList 사용
//
//        String cmd = ""; //명령어
//        int num = 0; //숫자
//
//        for (int i = 0; i < arraySize; i++) {
//            String[] str = br.readLine().split(" ");
//
//            cmd = str[0];
//            if (str.length > 1) num = Integer.parseInt(str[1]);
//
//            if (cmd.equals("push")) queue.add(num);
//            else if (cmd.equals("pop")) {
//                if (queue.size() != 0) {
//                    System.out.println(queue.remove(0));
//                } else System.out.println("-1");
//            } else if (cmd.equals("size")) System.out.println(queue.size());
//            else if (cmd.equals("empty")) {
//                if (queue.isEmpty()) System.out.println("1");
//                else System.out.println("0");
//            } else if (cmd.equals("front")) {
//                if (queue.isEmpty()) System.out.println("-1");
//                else System.out.println(queue.get(0));
//            } else if (cmd.equals("back")) {
//                if (queue.isEmpty()) System.out.println("-1");
//                else System.out.println(queue.get(queue.size() - 1));
//            }
//        }

// queue 시간초과
//ufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int arraySize = Integer.parseInt(br.readLine()); //입력값 개수
//
//        List<Integer> queue = new ArrayList<>(); //가변길이 ArrayList 사용
//
//        String cmd = ""; //명령어
//        int num = 0; //숫자
//
//        do {
//            String[] str = br.readLine().split(" ");
//
//            cmd = str[0];
//            if (str.length > 1) num = Integer.parseInt(str[1]);
//
//            switch (cmd) {
//                case "push":
//                    queue.add(num);
//                    break;
//                case "pop":
//                    if (queue.size() != 0) {
//                        System.out.println(queue.remove(0));
//                    } else System.out.println("-1");
//                    break;
//                case "size":
//                    System.out.println(queue.size());
//                    break;
//                case "empty":
//                    if (queue.isEmpty()) System.out.println("1");
//                    else System.out.println("0");
//                    break;
//                case "front":
//                    if (queue.isEmpty()) System.out.println("-1");
//                    else System.out.println(queue.get(0));
//                    break;
//                case "back":
//                    if (queue.isEmpty()) System.out.println("-1");
//                    else System.out.println(queue.get(queue.size() - 1));
//                    break;
//            }
//        } while (arraySize-- > 1);


//        String[] strs = br.readLine().split(" ");
//        int a = Integer.parseInt(strs[0]);
//        int b = Integer.parseInt(strs[1]);
//        int c = Integer.parseInt(strs[2]);

//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        int v = Integer.parseInt(br.readLine());
//
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        int v = Integer.parseInt(br.readLine());
//        int res = (v - a) + (a - b);

//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());


