package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Silver10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(br.readLine()); //입력값 개수

        List<Integer> zeroStack = new ArrayList<>(); //가변길이 ArrayList 사용

        for(int i = 0; i < arraySize; i++){ //입력한 가변길이 크기만큼 반복문 실행 예정
            int a = Integer.parseInt(br.readLine()); //배열(Stack)에 넣을 값 입력
            if (i > 0 && a == 0) zeroStack.remove(zeroStack.size()-1);
                //처음부터 0 넣으면 이상하니까, 그 이후부터 0 나오면 마지막에 들어간 숫자 제거
            else if(a != 0) zeroStack.add(a);  //0이 아니라면 맨뒤에 추가
        }

        //다 더하면 끝
        if(zeroStack.size() != 0) {
            int sum = 0;
            for (int j = 0; j < zeroStack.size(); j++){
                sum += zeroStack.get(j);
            }
            System.out.println(sum);
        } else System.out.println(0);
    }
}