package programmers_bootcamp;

import java.io.IOException;
public class hanghae_Main {
    public static void main(String[] args) throws IOException {
        hanghae_Main.Car car1 = new hanghae_Main.Car();

        int[] intArr = {1,2,3,4,5};
        System.out.println("결과 : " + car1.sum1(intArr));
    }

    private static class Car {
        int sum1(int ... valuesTest){
            int sum = 0;

            for (int i = 0; i < valuesTest.length; i++) {
                sum += valuesTest[i];
            }
            return sum;
        }
    }
}
