package programmers_bootcamp;

public class al_39_12926 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12926
    public static void main(String[] args) {
        //영문자 담은 배열 필요, 대소문자 다 쓰자
        //인덱스 활용해서 해보자 indexOf(값) : 값의 인덱스 알려줌 lastindexOf(값)은 거꾸로 찾아줌..
        //변환은 일단 replace로 하려고 했지만 찾아서 넣는걸로...
        //Z 처리하는게 관건
        String s = "abcdefghijklmnopqrstuvwxyz";
        int n = 25;
        String answer = "";

        //대문자 소문자 따로
        String bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallAlphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] bigChars = bigAlphabet.toCharArray();
        char[] smallChars = smallAlphabet.toCharArray();

        //찾고, 변환해주고  계산 다하고 마지막에 -1

            for (int i = 0; i < s.length(); i++) {
                //문자열 내 문자 추출
                char workChar = s.charAt(i);
                //System.out.println(workChar);
                int workInt = 0;
                boolean isBig = true;

                //공백이 아니라면
                if (workChar != ' ') {
                    //대소문자 판별
                    if (Character.isUpperCase(workChar)) {
                        workInt = bigAlphabet.indexOf(workChar);
                        isBig = true;
                        //System.out.println(workInt);
                    } else if (Character.isLowerCase(workChar)) {
                        workInt = smallAlphabet.indexOf(workChar);
                        isBig = false;
                        //System.out.println(workInt);
                    }

                    //업그레이드 대비
                    workInt += n;
                    if (workInt >= 26) {
                            workInt -= 26;
                    } System.out.println(workInt);

                    //if (workInt == 25) {
                    //   workInt = -1;
                    //} //Z인 경우 나머지 0에  +2 하면 1이 아니고 2가 되기에 -1로 함
                    //workInt %= 25;//(bigAlphabet.length() - 1);
                    //workInt += n;

                    //System.out.println(workInt);

                    char caesar = 'O';  //내가 바로 O!!!
                    if (isBig == true) caesar = bigAlphabet.charAt(workInt);
                    else if (isBig == false) caesar = smallAlphabet.charAt(workInt);
                    //System.out.println(caesar);

                    answer += caesar;
                } else answer += " ";
            }
        System.out.println(answer);
    }
}


////영문자 담은 배열 필요, 대소문자 다 쓰자
//        //인덱스 활용해서 해보자 indexOf(값) : 값의 인덱스 알려줌 lastindexOf(값)은 거꾸로 찾아줌..
//        //변환은 일단 replace로
//        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        int n = 25;
//        String answer = "";
//
//        //대문자 소문자 따로
//        String bigAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String smallAlphabet = "abcdefghijklmnopqrstuvwxyz";
//        //System.out.println(bigAlphabet.length());
//        //System.out.println(smallAlphabet.length());
//
//        char[] bigChars = bigAlphabet.toCharArray();
//        char[] smallChars = smallAlphabet.toCharArray();
//
//        //System.out.println(s.length());
//        //System.out.println(s.charAt(0));
//        //System.out.println(bigAlphabet.indexOf("Z"));
//
//        for (int i = 0; i < s.length(); i++) {
//            char workChar = s.charAt(i);
//            //System.out.println(workChar);
//            int workInt = 0;
//            boolean isBig = true;
//            if (workChar != ' ') {
//                if (Character.isUpperCase(workChar)) {
//                    workInt = bigAlphabet.indexOf(workChar);
//                    isBig = true;
//                    //System.out.println(workInt);
//                } else if (Character.isLowerCase(workChar)) {
//                    workInt = smallAlphabet.indexOf(workChar);
//                    isBig = false;
//                    //System.out.println(workInt);
//                }
//
//                if (workInt == 25) {
//                    workInt = -1;
//                } //Z인 경우 나머지 0에  +2 하면 1이 아니고 2가 되기에 -1로 함
//                workInt %= 25;//(bigAlphabet.length() - 1);
//                workInt += n;
//
//                //System.out.println(workInt);
//
//                char caesar = 'O';  //내가 바로 O!!!
//                if (isBig == true) caesar = bigAlphabet.charAt(workInt);
//                else if (isBig == false) caesar = smallAlphabet.charAt(workInt);
//                //System.out.println(caesar);
//
//                answer += caesar;
//            } else answer += " ";
//        }
//
//        System.out.println(answer);