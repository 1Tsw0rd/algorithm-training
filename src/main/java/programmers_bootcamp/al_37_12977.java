package programmers_bootcamp;

public class al_37_12977 {  //https://school.programmers.co.kr/learn/courses/30/lessons/12977
    public static void main(String[] args) {
        //3개씩 경우의 수 더하기 진행 => 3중for문 이용
        //소수판별 필요 => 2와 3으로 나머지 1 나오면 소수로 판별
        //소수는 자기보다 낮은 수에서 나눠지는게 없는 수..(2와 3으로 안나눠지는 건줄... 25는 5로 나눠져...하...)

        int[] nums = {1, 2, 3, 4};
        int answer = 0;

        //배열 길이 구하기
        int numsLen = nums.length;
        //System.out.println(numsLen);

        //3중 포문 작업
        int workNum = 0;

        int adjustLenI = 0;
        int adjustLenJ = 0;
        int adjustLenZ = 0;

        int numLenI = 0;
        int numLenJ = 0;
        int numLenZ = 0;


        switch (numsLen) {
            case 3:
                adjustLenI = 0;
                adjustLenJ = 0;
                adjustLenZ = 0;
                //System.out.println(3 + "옴");
            case 4:
                adjustLenI = 1;
                adjustLenJ = 0;
                adjustLenZ = 0;
                //System.out.println(4 + "옴");
            default:
                adjustLenI = 2;
                adjustLenJ = 1;
                adjustLenZ = 0;
                //System.out.println(5 + "옴");
        }

        numLenI = numsLen - adjustLenI;
        numLenJ = numsLen - adjustLenJ;
        numLenZ = numsLen - adjustLenZ;

        //System.out.println("numLenI : "+numLenI);
        //System.out.println("numLenJ : "+numLenJ);
        //System.out.println("numLenZ : "+numLenZ);

        for (int i = 0; i < numLenI; i++) {
            //System.out.println("i는 " + i);
            for (int j = i + 1; j < numLenJ; j++) {
                //System.out.println("j는 " + j);
                //System.out.println("iniJ : "+initJ);
                for (int z = j + 1; z < numLenZ; z++) {
                    workNum = nums[i] + nums[j] + nums[z];
                    //System.out.println("z는 " + z);
                    //System.out.println("iniZ : "+initZ);
                    //System.out.println("i : " + nums[i] + " j : " + nums[j] + " z : " + nums[z] + " = " + workNum);
                    //소수 판별
                    int checkNum = isPrime(workNum);
                    //if ((workNum % 2 != 0 && workNum % 3 != 0) || (workNum == 2 || workNum ==3)){
                    if (checkNum == 0) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    private static int isPrime(int workNum) {

        int isPrime = 0;
        for (int i = 2; i < workNum; i++) {
            if (workNum % i == 0) {
                isPrime = 1;
                break;
            }
        }
        return isPrime;
    }
}
