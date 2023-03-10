package programmers_bootcamp;

import java.util.HashMap;

public class HanghaeAlTest1 {
    public String solution(int[] arr1) {
        //0 개수, 1개수 구해서 도개걸윷모 계산하면 됨
        //근데 굳이 1개수까지 필요 없을 것 같음

        //1. 0개수 담을 변수 선언
        int zero = 0;
        //int one = 0;

        //2. 0개수 세기 => 향상된 for문
        for (int i : arr1) {
            if (i == 0) zero++;
            //else if(i == 1) one++;
        }

        //3. 도개걸윷모 구현(key, value 기능 활용 => hashmap 이용)
        //배 0, 등 1 의미
        //배(0) 개수를 기준으로 진행
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(4, "윷"); //등0 배4 => 윷
        hs.put(3, "걸"); //등1 배3 => 걸
        hs.put(2, "개"); //등2 배2 => 개
        hs.put(1, "도"); //등3 배1 => 도
        hs.put(0, "모"); //등4 배0 => 모

        //4. 결과 출력
        String answer = hs.get(zero);
        return answer;
    }

    public static void main(String[] args) {
        HanghaeAlTest1 method = new HanghaeAlTest1();
        int[] arr1 = {1, 0, 0, 0};
        System.out.println(method.solution(arr1));
    }
}

