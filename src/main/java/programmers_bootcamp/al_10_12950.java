package programmers_bootcamp;

import java.util.Arrays;

public class al_10_12950 { //https://school.programmers.co.kr/learn/courses/30/lessons/12950
    public static void main(String[] args) {
        //배열이 2개이지만 각각의 위치에 해당하는 녀석들끼리 더하면 됨
        //for문을 돌려도 같은 위치이기에 동일한 인덱스값 사용하면 됨
        //근데 행렬 수가 달라질 수 있으므로 이것을 해결하는 것이 관건

        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};


        System.out.println(arr1.length);
        System.out.println(arr1[0].length); //여기까지 체크할 필요 있다 열 갯수

        int rowSize = arr1.length; //2
        int columnSize = arr1[0].length;//3
        int arr1Num = 0;
        int arr2Num = 0;



        int[][] answer = new int[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++){
            for (int j = 0; j < columnSize; j++){
                arr1Num = arr1[i][j];
                arr2Num = arr2[i][j];
                System.out.println(arr1Num + " " +arr2Num);

                answer[i][j] = (arr1Num + arr2Num);
                //System.out.println("answer[i" + i + "]" + "[" + j + "]" + answer[j][i]);
            }
        }

        System.out.println(Arrays.toString(answer[0]) );
        System.out.println(Arrays.toString(answer[1]) );
    }
}
