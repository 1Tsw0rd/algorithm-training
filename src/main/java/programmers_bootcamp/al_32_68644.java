package programmers_bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class al_32_68644 { //https://school.programmers.co.kr/learn/courses/30/lessons/68644
    public static void main(String[] args) {
        //모든 경우의 수 돌려서 더하고
        //중복 제거 => HashSet 사용.. 정렬은 안됨
        //오름차순 정렬 ㄱㄱ List변환해서

        int[] numbers = {1,3,4,5,61,1,1};//{2,1,3,4,1};
        List<Integer> arrayList = new ArrayList<>();

        int i;
        int j = 0;
        for (int i1 : numbers) {
            j++;
            for (i = j; i < numbers.length; i++){
                //System.out.println("i1 : " + i1 + " number[" + i + "] : " + number[i]);
                arrayList.add(i1 + numbers[i]);
            }
        }
        HashSet<Integer> hs = new HashSet<>(arrayList);

        List<Integer> answer = new ArrayList<>(hs);
        Collections.sort(answer);

        System.out.println(answer);
    }
}
