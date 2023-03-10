package programmers_bootcamp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class re_al_26_12935 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12935
    public static void main(String[] args) {
        //정수형 배열 참조변수(call by reference) 안에 가장 작은 수 찾기
        //그 녀석 제거 int[] -> list -> 제거 -> int[]
        //요청한대로 출력력
        //만약 정수 배열 사이즈가 1이라면 -1 출력

        int[] arr = {4, 3, 2, 1, 5, 1};
        int[] answer = {-1};


        if (arr.length < 2) answer[0] = -1;
        else {
            //제거 : int배열 -> 리스트 변환 -> 제거 -> 다시 int배열
            List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());

            //이거 먼저하면 순서 바뀜
            Arrays.sort(arr);

            intList.removeIf(n -> n == arr[0]);
            answer = intList.stream().mapToInt(i -> i).toArray();

        }
        System.out.println(Arrays.toString(answer));
    }
}

//        int minNum = arr[0];
//        int[] removeIndex = {}; //중복깂 때문에 배열
//
//        if (arr.length == 1) answer[0] = -1;
//
//        for (int i = 0; i < arr.length; i++){
//            if (minNum > arr[i]) {
//                minNum = arr[i];
//                removeIndex[0] = arr[i];
//            }
//        }







//        int[] arr = {4,3,2,1};
//       // List<Integer> answer = new ArrayList<>();
//
//        List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        int minNum = arr[0];
//        int removeIndex = 0;
//
//        if (arr.length == 1) answer.add(-1);
//        else {
//            for (int i = 0; i <  arr.length; i++){
//                if (minNum > arr[i]) removeIndex = i;
//            }
//        }
//        answer.remove(removeIndex);
//
//
//        System.out.println(answer);