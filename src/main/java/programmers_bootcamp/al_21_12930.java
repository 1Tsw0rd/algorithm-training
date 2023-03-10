package programmers_bootcamp;

public class al_21_12930 {  //https://stove99.tistory.com/96
    public static void main(String[] args) {
        //공백은 구분자
        //문자열 안에 문자 하나씩 체크 필요 charAt(인덱스) 활용.. 해당 인덱스의 값 가져옴
        //대문자 변환 함수 필요 toUpperCase()
        //변환하는 카운터? 같은게 필요

        //낚임 포인트.. 입력되는 문자열에 처음부터 대문자로 들어오는 경우가 있을 수 있음 toLowerCase() 사용해야 함

        String s = "try hello world";
        String answer = "";

        int toggle = 0; //0은 홀, 1은 짝

        for (int i = 0; i < s.length(); i++){
            //System.out.println(s.charAt(i));

            char charTest = s.charAt(i);

            if (charTest == ' '){
                toggle = 0;
                answer += charTest;
                continue;
            }

            if (toggle == 0){
               charTest = Character.toUpperCase(charTest);
               toggle = 1;

                //System.out.println(charTest);
            } else if (toggle == 1) {
                charTest = Character.toLowerCase(charTest);
                toggle = 0;
            }
            answer += charTest;
        }

        System.out.println(answer);
    }
}
