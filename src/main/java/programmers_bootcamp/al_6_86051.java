package programmers_bootcamp;

public class al_6_86051 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/86051
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};

        //모두 더해서 뺀다.0.
        int baseNum = 45; //1~9 모두 더한 값
        int sumNum = 0;
        for(int i = 0; i < numbers2.length; i++){
            sumNum += numbers2[i];
            System.out.println(numbers2);
        }

        System.out.println(baseNum-sumNum);

    }
}
