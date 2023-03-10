package programmers_bootcamp;

public class Singleton {
    //필드(정적) - 자신의 객체를 생성해 초기화

    private static Singleton singleton = new Singleton();

    //생성자
    private Singleton() {
    }

    //메서드(정적) - 자신의 객체 singleton 리턴
    static Singleton getInstance() {
        return singleton;
    }
}
