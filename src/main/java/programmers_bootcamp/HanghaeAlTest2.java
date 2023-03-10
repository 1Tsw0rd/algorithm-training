package programmers_bootcamp;

public class HanghaeAlTest2 {
        public void solution(int star) {
            //분석
            //star 변수는 삼각형 크기
            //별은 삼각형 맨 위부터 1 3 5 7 ...는 +2씩 커짐
            //공백 시작은 star - 그려질 별개수(첫번째 별 3 - 1 =2, 첫번쨰 공백 2)
            //별크기는 star - 공백 = 나온 값 + 2씩 계속 증가시면 하면됨

            //그리는 진행방식 : 공백부터 그리고 별찍기

            for (int i = 0; i < star; i++){
                int spaceSize = star - (i+1); //공백 크기 구하기,  +1은 i가 0부터 시작해서
                int starSize = star - spaceSize + i; //별 크기, i는 +1씩 증가인데, 인덱스 0부터 시작하므로 보이지 않은 +1이 있어 실제론 +2임
                String space = "";
                String stars = "";

                //공백 그리고
                for (int j =0; j < spaceSize; j++){
                     space += " ";
                }

                //별 그리고
                for (int z = 0; z < starSize; z++){
                    stars += "*";
                }

                //합치기(정력)
                System.out.println(space + stars);
            }
        }

        public static void main(String[] args) {
            HanghaeAlTest2 method = new HanghaeAlTest2();
            int star = 9;
            method.solution(star);
        }
}

