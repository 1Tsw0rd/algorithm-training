package programmers_bootcamp;

public class al_27_12943 { //https://school.programmers.co.kr/learn/courses/30/lessons/12943
    public static void main(String[] args) {
        //공식은 나온대로 구현하면 될듯
        //작업 횟수 담는 애 필요
        //입력 숫자가 1인 경우 0
        //작업횟수 500 넘어가면 -1 반환

        int num = 626331;  //이거 Long로 해야된다네...
        int answer = 0;
        int workCount = 0;

        if (num > 1) {
            while (num != 1) {
                System.out.println(workCount);
                //System.out.println(num);
                workCount++;
                if (workCount < 500) {

                    if (num % 2 == 0) num /= 2;
                    else {
                        num *= 3;
                        num++;
                    }
                } else {
                    workCount = -1;
                    break;
                }
            }
        }
        answer = workCount;
        System.out.println(answer);
    }
}
