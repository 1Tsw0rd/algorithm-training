package programmers_bootcamp;

public class al_8_12944 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/12944
        double answer = 0;

        int[] arr = {5,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        answer = (double)sum / arr.length;

        System.out.println(answer);
    }
}
