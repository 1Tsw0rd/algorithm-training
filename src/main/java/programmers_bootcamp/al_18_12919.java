package programmers_bootcamp;

public class al_18_12919 { //https://programmers.co.kr/learn/courses/30/lessons/12919
    public static void main(String[] args) {
        //Kim문자열 찾으면 됨
        String answer = "";
        String[] seoul = {"Jane", "Kim"};
        String Target = "Kim";

        for (int i = 0; i < seoul.length; i++){
            if (seoul[i].equals(Target)){ //문자열 비교해야함, ==은 참조타입 문자열 배열 seoul로 인해 참조주소 비교함(call by value)
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        System.out.println(answer);

    }
}
