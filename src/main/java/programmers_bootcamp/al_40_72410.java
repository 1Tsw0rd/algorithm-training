package programmers_bootcamp;

public class al_40_72410 { //https://school.programmers.co.kr/learn/courses/30/lessons/72410
    public static void main(String[] args) {
        //아이디 3자이상 15자이하 => 길이제한 필요 if문 사용
        //소문자, 숫자, 빼기(-), 밑줄(_),마침표(.)\
        // 만 사용 가능 => 정규식 필요 "[a-z][0-9]-_."
        //.은 처음과 끝 사용 X, 연속으로 사용 못함 => comparator 사용?

        /*
        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
             만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        */

        String new_id = "12";
        String answer = "12332";

        new_id = new_id.toLowerCase(); //1단계 모든 대문자 -> 소문자 치환
        new_id = new_id.replaceAll("[^a-z0-9-_.]", ""); //2단계 계정 생성 조건 외 모든 문자 제거 여기서 ^는 부정
        new_id = new_id.replaceAll("[.]{2,}", "."); //3단계 마침표(.) 2개이상 반복 시 하나만 출력 ex){2,4} 2번이상 4번이하
        new_id = new_id.replaceAll("^[.]|[.]$", ""); //4단계 ^:문자열 시작, $:문자열 끝, x|y : x 또는 y
        new_id = new_id.replaceAll("^$", "a"); //5단계 빈 문자열 일 경우 a로 변환, ^$ : 빈문자열 의미

        if (new_id.length() >= 16) {
            new_id= new_id.substring(0,15); //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
            new_id = new_id.replaceAll("[.]$", ""); //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 제거
        }

        if (new_id.length() <= 2){ //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
            char a = new_id.charAt(new_id.length() -1);
            new_id += (a+"").repeat(3 - new_id.length());
//            while (new_id.length() < 3) {
//                new_id.repeat(a);
//                new_id += a;
//            }
        }
        answer = new_id;
        System.out.println(answer);
    }
}
