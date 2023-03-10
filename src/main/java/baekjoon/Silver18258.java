package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Silver18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //빠른 출력을 위해 사용 장단점이 있겠지만 StringBuffer보다 빠르다 함

        int arraySize = Integer.parseInt(br.readLine()); //입력값 개수

        List<Integer> queue = new LinkedList<>(); //가변길이 ArrayList 보다 LinkedList가 빠르다고 함(시간초과 해결)

        String cmd = ""; //명령어

        for (int i = 0; i < arraySize; i++) {
            String[] str = br.readLine().split(" ");

            cmd = str[0];

            switch (cmd) {
                case "push":
                    queue.add(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    if (queue.size() != 0) {
                        sb.append(queue.remove(0)).append("\n");
                    } else sb.append(-1).append("\n");;
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.get(0)).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.get(queue.size() - 1)).append("\n");
                    break;
            }
        }
        System.out.println(sb); //출력은 StringBuilder를 이용해서 캐시값으로 한방에 출력, 일일히 ㄴㄴ
    }
}