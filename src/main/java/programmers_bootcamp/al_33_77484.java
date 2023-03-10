package programmers_bootcamp;

import java.util.*;
import java.util.stream.Collectors;

public class al_33_77484 { //https://school.programmers.co.kr/learn/courses/30/lessons/77484
    public static void main(String[] args) {
        //다 맞았을 경우, 다 틀렸을 경우
        //맞은 숫자 체크
        //다 맞은 경우 등수 체크 => 개수 +
        //다 틀린 경우 등수 체크 => 개수 -
        //0 개수 체크 필요

        //등수 배열 필요
        //배열 내 특정 값 찾기 진행 List의 contains 쓰자...
        int[] lottos = {1,2,8,11,12,33};
        int[] win_nums = {20,9,3,45,4,35};//{31,10,45,1,6,19};
        int[] answer = new int[2];

        //맞은 갯수, 등수
        HashMap<Integer, Integer> tiers = new HashMap<>();
        tiers.put(6,1);
        tiers.put(5,2);
        tiers.put(4,3);
        tiers.put(3,4);
        tiers.put(2,5);
        tiers.put(1,6);
        tiers.put(0,6);

        int count = 0;
        int zeroCount = 0;

        //0 개수 구하기 + 또는 - 로 활용
        for (int lotto : lottos) {
            if (lotto == 0) zeroCount++;
        }
        System.out.println(zeroCount);

        List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        System.out.println(lottoList);

        for (int win_num : win_nums) {
           count += (lottoList.contains(win_num) == true) ? 1 : 0;
        }

        int maxTier = count + zeroCount;
        int minTier = count;

        System.out.println("Max : " + maxTier);
        System.out.println("min : " + minTier);

        if (maxTier < 2) {
            answer[0] = 6;
            answer[1] = 6;
        } else {
            answer[0] = tiers.get(maxTier);
            answer[1] = tiers.get(minTier);
        }
        System.out.println(Arrays.toString(answer));

    }
}
