package programmers_bootcamp;

import java.util.*;

public class al_34_42840 { //https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String[] args) {
        //1수포자 : 1,2,3,4,5
        //2수포자 : 2, 1, 2, 3, 2, 4, 2, 5
        //3수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5

        //패턴 비교 일치하는 개수로 순위 결정하여 출력..<< ㅅㅂ 가장 많이 마춘 사람만 출력
        //0개 맞으면 리턴 못함
        //동점일 경우 수포자 이름 순으로 출력
        int[] answers = {2, 0, 1, 1, 5, 1, 2, 3, 4, 5}; //{1,2,3,4,2};
        System.out.println(answers.length);
        int[] supo1pat = {1, 2, 3, 4, 5};
        int[] supo2pat = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3pat = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        System.out.println(supo2pat.length);
        System.out.println(supo3pat.length);

        int supo1ck = 0;
        int supo2ck = 0;
        int supo3ck = 0;

        //정답 갯수 구하기
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (i % 5 == 0) j1 = 0;
            if (i % 8 == 0) j2 = 0;
            if (i % 10 == 0) j3 = 0;
           // System.out.println("dha : " + i + " j1 : " + j1 + " j2 :" + j2 + " j3 : " + j3);
            //System.out.println(answers[i]);
            if (answers[i] == supo1pat[j1]) supo1ck += 1;
            if (answers[i] == supo2pat[j2]) supo2ck += 1;
            if (answers[i] == supo3pat[j3]) supo3ck += 1;
            j1++;
            j2++;
            j3++;
        }

        System.out.println(supo1ck);
        System.out.println(supo2ck);
        System.out.println(supo3ck);

        int topBoy = Math.max(supo1ck, Math.max(supo2ck,supo3ck));

        List<Integer> answer = new ArrayList<>();

        if (topBoy == supo1ck) answer.add(1);
        if (topBoy == supo2ck) answer.add(2);
        if (topBoy == supo3ck) answer.add(3);


        System.out.println(answer);
    }
}

//    public static void main(String[] args) {
//        //1수포자 : 1,2,3,4,5
//        //2수포자 : 2, 1, 2, 3, 2, 4, 2, 5
//        //3수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
//
//        //패턴 비교 일치하는 개수로 순위 결정하여 출력..<< ㅅㅂ 가장 많이 마춘 사람만 출력
//        //0개 맞으면 리턴 못함
//        //동점일 경우 수포자 이름 순으로 출력
//
//        int[] answers = {2, 0, 1, 1, 5, 1, 2, 3, 4, 5}; //{1,2,3,4,2};
//        System.out.println(answers.length);
//        int[] supo1pat = {1, 2, 3, 4, 5};
//        int[] supo2pat = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] supo3pat = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
//        System.out.println(supo2pat.length);
//        System.out.println(supo3pat.length);
//
//        int supo1ck = 0;
//        int supo2ck = 0;
//        int supo3ck = 0;
//
//        //정답 갯수 구하기
//        int j1 = 0;
//        int j2 = 0;
//        int j3 = 0;
//        for (int i = 0; i < answers.length; i++) {
//            if (i % 5 == 0) j1 = 0;
//            if (i % 8 == 0) j2 = 0;
//            if (i % 10 == 0) j3 = 0;
//           // System.out.println("dha : " + i + " j1 : " + j1 + " j2 :" + j2 + " j3 : " + j3);
//            //System.out.println(answers[i]);
//            if (answers[i] == supo1pat[j1]) supo1ck += 1;
//            if (answers[i] == supo2pat[j2]) supo2ck += 1;
//            if (answers[i] == supo3pat[j3]) supo3ck += 1;
//            j1++;
//            j2++;
//            j3++;
//        }
//
//        System.out.println(supo1ck);
//        System.out.println(supo2ck);
//        System.out.println(supo3ck);
//
//        //정렬이 문제네////
//
//        HashMap<String, Integer> hs = new HashMap();
//        hs.put("1", supo1ck);
//        hs.put("2", supo2ck);
//        hs.put("3", supo3ck);
//
//        //0점자 제거
//        hs.values().removeAll(Collections.singleton(0));
//        System.out.println();
//
//        List<Map.Entry<String, Integer>> list = new LinkedList<>(hs.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                int comparision = (o1.getValue() - o2.getValue()) * -1;
//                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
//            }
//        });
//
//        System.out.println(list.size());
//
//
//        int[] answer = new int[list.size()];
//
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = Integer.parseInt(list.get(i).getKey());
//
//        }
//        System.out.println(Arrays.toString(answer));
//    }