package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Silver11866 {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
        StringBuilder sb = new StringBuilder(); //빠른 출력을 위해 사용 장단점이 있겠지만 StringBuffer보다 빠르다 함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int humans = Integer.parseInt(st.nextToken());
        int killPoint = Integer.parseInt(st.nextToken());

        List<Integer> josephus = new LinkedList<>();

        //요세푸스 순열 만들기
        for (int i = 1; i <= humans; i++) {
            josephus.add(i);
        }

        sb.append("<");
        killPoint = killPoint - 1;

        int josepSize = josephus.size();
        for (int j = killPoint; 0 < josephus.size(); j += killPoint) {

            if (j < josepSize) {
            } else if (j > josepSize) { //j가 배열보다 커지는 부분 <= 규칙2 & 규칙3
                j = j - josepSize;
                j = j % josepSize;
            } else if (j == josepSize) { //규칙3 - 결국엔 0 적용이라...
                j = 0;
            } else if (josepSize == 1) { //마지막 숫자
                j = 0;
                System.out.println("josepSize == 1 => index : " + j + " 값 : " + josephus.get(j) + " 배열 : " + josephus);
            }
            sb.append(josephus.get(j) + ", "); //맨 앞 띄어쓰기 찾는게 뒤에서 찾는 것보다 빠를 것 같아서
            josephus.remove(j);
        }
        sb.append(">");
        int lastSim = sb.lastIndexOf(">");
        sb.delete(lastSim - 2, lastSim);
        System.out.println(sb);
    }
    //30 9 는 <9 18 27 6 16 26 7 19 30 12 24 8 22 5 23 11 29 17 10 2 28 25 1 4 15 13 14 3 20 21>
}

////위 코드 다듬어 봄/////////////////////////////////////////////////////
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        StringBuilder sb = new StringBuilder();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int h = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//
//        ArrayList<Integer> jl = new ArrayList<>();
//        for (int i = 1; i <= h; i++) {
//            jl.add(i);
//        }
//
//        sb.append("<");
//        k -= 1; //줄임 k = k - 1;
//        int js;
//
//        for (int j = k; 0 < jl.size(); j += k) {
//            js = jl.size();
//            if(j < js){}
//            else if (j > js) {
//                j = (j - js) % js; //합쳐서 줄임 j = j % js; 랑
//            } else if (j == js) { //줄임 j == js || js == 1
//                j = 0;
//            }
//            sb.append(jl.get(j) + ", ");
//            jl.remove(j);
//        }
//
//        sb.append(">");
//        int ls = sb.lastIndexOf(">");
//        sb.delete(ls - 2, ls);
//        System.out.println(sb);
//    }
//}
