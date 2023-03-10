package programmers_bootcamp;

import java.util.Arrays;

public class ThreeArrayTest {
    public static void main(String[] args) {
        //🛎️ 2차원 배열을 응용하여 3차원 배열을 만들어보자!
        //
        //- 2의 제곱 값, 3의 제곱 값, 4의 제곱 값, 5의 제곱 값 각각 8묶음의 형태로 되어있는 3차원 배열을 만드시오.
        //- 3차원 배열을 다 만든 후 묶음이 잘 보이도록 개행을 하여 출력한다.

//        int[][][] threeArray = new int[1][1][2];//{{{1,2,3},{1,2,3}}}; //[x] : 3차원배열, [x][x] : 2차원배열, [][][] : 1차원 배열 값....
//        threeArray[0][0][0]  =1;
//        threeArray[0][0][1]  =2;
//
//        System.out.println(Arrays.toString(threeArray[0][0]));



        //2~5 제곱, 각각 8개씩
        int[][][] threeArr = new int[1][4][8];
        //[] : 얘는 대빵(거듭제곱 임)
        //[][] : 밑수(2~5) 넣고
        //[][][] : 제곱결과(8개씩)

        int powSeung = 0; //제곱 값들 넣을 공간
        int powBaseNum = 0;
        for(int x = 2; x <= 5; x++){
            for (int y = 0; y < 8; y++){
                powSeung = (int) Math.pow(x,y);
                //System.out.println("x : " + x + " y : "+ y + " pow : " + powSeung + " powBaseNum : " + powBaseNum);

                threeArr[0][powBaseNum][y] = powSeung;
            }
            System.out.println(Arrays.toString(threeArr[0][powBaseNum]));
            //powBaseNum++;
        }





    }
}
