package programmers_bootcamp;

import java.util.Arrays;

public class al_46_42748 { //https://school.programmers.co.kr/learn/courses/30/lessons/42748
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3},{1,7,4}};//자를인덱스 시작, 끝, 몇번째 숫자인지
        int[] answer = new int[commands.length];

        //array는 계속 활용
        //cmmands 2이차원 배열은 commands[0][i]  << i가 계속 증가하면서 값 추출
        //인덱스 담을 변수들 적극 활용
        //자르기 기능은 Arrays.copyOfRange(array, startIdx, 복사할길이); 사용

        int startIdx = 0; //자를 시작인덱스 담을 변수
        int endIDx = 0; //자를 끝인덱스 담을 변수
        int choiceIdx = 0; //선택할 인덱스 담을 변수

        int i = 0; //정답용 변수

        for (int[] command : commands) {
            startIdx = command[0] - 1; //자를 인덱스 시작(-1) << 인덱스는 0번부터 시작
            endIDx = command[1]; //endIdx는 바로 직전 인덱스까지 잘라줌
            choiceIdx = command[2] - 1; //선택할 숫자 인덱스(-1)

            int[] workNum = Arrays.copyOfRange(array, startIdx, endIDx);
            Arrays.sort(workNum);

            answer[i] = workNum[choiceIdx];
            i++;
        }
            System.out.println(Arrays.toString(answer));
    }
}
