package programmers_bootcamp;

import java.util.ArrayList;
import java.util.List;


public class al_31_12906 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public static void main(String[] args) {
        // 숫자 0~9 중 연속된 숫자에서 중복된거 없에고 출력
        //배열 하나씩 검사 필요
        //숫자가 달라질 경우 중복제거 시작 신호
        //중복제거하나 숫자 1개는 남겨야 됨

        //list 사용해서 이전 값과 다음과 비교해서 같으면 제거, 다르면 새로운 시작

        int[] arr ={1,1,3,3,0,1,1};// {4,4,4,3,3}; //


//        List<Integer> workList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i ++){
            if(i == arr.length -1) answer.add(arr[i]);
            else if(arr[i] != arr[i+1]){
                answer.add(arr[i]);
                System.out.println(answer);
            }
        }
        System.out.println(answer);

    }
}

//정답이긴한데.. 효율성에서 떨어짐
//        int[] arr = {4,4,4,3,3}; //{1,1,3,3,0,1,1};
//        int[] answer = {};
//
//        List<Integer> workList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        int nowIndex = 0;
//
//        for (int i; nowIndex < workList.size()-1;){
//                i = nowIndex;
//            System.out.println(i);
//            if (workList.get(i).equals(workList.get(i+1))) {
//                workList.remove(i+1);
//                nowIndex = i;
//
//            } else if (nowIndex == workList.size()-1) {
//                break;
//            } else nowIndex++;
//            System.out.println(workList);
//        }
//        answer = workList.stream().mapToInt(i -> i).toArray();
//
//        System.out.println(workList);
//        System.out.println(Arrays.toString(answer));
