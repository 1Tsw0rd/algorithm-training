package programmers_bootcamp;

import java.time.LocalDate;

public class al_13_12901 {
    public static void main(String[] args) { //https://school.programmers.co.kr/learn/courses/30/lessons/12901
        String[] answer = {"NON", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}; //일요일 이자식...
        int year = 2016;
        int a = 2;
        int b = 21;

        LocalDate date = LocalDate.of(year, a, b);
        int yoil = date.getDayOfWeek().getValue(); //일요일은 7


        System.out.println(answer[yoil]);
    }
}
