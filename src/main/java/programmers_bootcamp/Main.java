package programmers_bootcamp;

public class Main {
    public static void main(String[] args) {

        //Singleton obj1 = new Singleton(); 컴파일 에러 발생

        //객체 생성하는데 new 안씀ㅋ
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체임");
        }
    }
}