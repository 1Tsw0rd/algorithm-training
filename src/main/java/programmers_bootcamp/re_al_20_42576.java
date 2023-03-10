package programmers_bootcamp;


import java.util.*;

public class re_al_20_42576 { //https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};//{"keke", "keke"};//{"leo", "eden", "leo"};
        String[] completion = {"stanko", "ana", "mislav"};//{"eden", "kiki"};//{"keke"};
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String player:participant){ //참가자
            map.put(player, map.getOrDefault(player, 0) + 1); //getOrDefault : 지정된 키로 매핑 값이 없으면 0(디폴트값) 반환
                                                                         //근데 여기선 1로 지정.. 동명이인 있다면 +2
                                                                         //동명이인이라면 숫자부분이 +1 떠 되겠지
        }

        for (String player:completion){
            map.put(player, map.get(player) -1); //만약 hashmap에서 참가자 명단과 동일한 애가 있는 경우 -1 함, 최종 1 찍힌 애가 미완주자

            //Iterator 배열이나 유사하한 자료구조의 내부요소를 순회하는 객체
            //next() : 다음, previous() : 이전 활용하요 앞 뒤로 이동 가능
            //hasNext() : 사용하여 딥검색 가능
            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

            //https://tychejin.tistory.com/31   << 여기 실습 다해보자]]]]]]]]
            //https://stove99.tistory.com/96
            //Map.entry : key와 value 모두 필요한 경우 사용
            //Map.keySet() : key만 필요한 경우 사용
            //entrySet().iterator() : iterator 사용할 수 없는 Collection Map에서 사용하기 위해서는
            //entrySet(), keySet() 이용하여 Set객체 반환 후 사용하면 됨

            while (iter.hasNext()){
                Map.Entry<String, Integer> entry = iter.next();
                if (entry.getValue() != 0){
                    answer = entry.getKey();
                    break;
                }
            }

        }




        System.out.println(map);



        System.out.println(answer);


    }
}
//정렬이용하여 풀이
//String[] participant = {"keke", "keke"};//{"leo", "eden", "leo"};//{"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"keke"};//{"eden", "kiki"};//{"stanko", "ana", "mislav"};
//        String answer = "";
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            //System.out.println(" 완주자[" + i + "]" + completion[i] + " 참가자[" + i + "] : " + participant[i]);
//            if (!participant[i].equals(completion[i])) {
//                answer = participant[i];
//                break;
//            }
//            if (i == completion.length - 1) {
//                answer = participant[i + 1];
//            }
//        }
//        System.out.println(answer);

// //참조주소 이용!!!
////        System.out.println(System.identityHashCode(participant[0]));
////        System.out.println(System.identityHashCode(participant[2]));
////        System.out.println(System.identityHashCode(completion[2]));
//
//        //indexOf 중복값 찾기
//
////        System.out.println(Arrays.toString(participant));
//
//        //동명이인 문제는 개수로 해결
//        //미완주자는 완주자 명단에 없는 사람으로 해결
//
//        Set<String> setPar = new HashSet<>(Arrays.asList(participant));
//        Set<String> setCom = new HashSet<>(Arrays.asList(completion));
//
//        List<String> parList = Arrays.asList(participant);
//
//        //동명이인 있는 경우 https://whitepro.tistory.com/411
//        if (setPar.size() == setCom.size()) {
//            HashSet<String> hs = new HashSet<>();
//            for (String el : parList){
//                if (parList.indexOf(el) != parList.lastIndexOf(el)){
//                    //System.out.println(el);
//                    answer = el;
//                    break;
//                }
//            }
//        } else {
//            for (int i = 0; i < parList.size(); i ++){
//                if (!setCom.contains(parList.get(i))){
//                    answer = parList.get(i);
//                    break;
//                }
//            }
//        }
//        //System.out.println(setPar);
//        //System.out.println(setCom);
//        //System.out.println("험" + setPar.contains(setCom));
//        System.out.println("ans" + answer);


//        String[] participant = {"mislav", "stanko", "mislav", "ana"};//{"leo", "kiki", "eden"};
//        String[] completion = {"stanko", "ana", "mislav"};//{"eden", "kiki"};
//        String answer = "";
//        //동명이인 있는 경우가 주의할 부분인 듯
//        //참가자 명단에서 완주자 한명씩 빼면 되지~
//        //근데 Collection을 사용 못해서 배열 복사하는 arraycopy() 활용
//        //이걸로 participant 배열 하나씩 줄여나갈 예정
//        //참가자 명단에서 완주자를 찾으면 해당 인덱스를 기억하고, 맨 뒤 인덱스에 있는 참가자를 찾은 완주자 인덱스에 넣을 것임
//        //그리고 arraycopy() 사용해서 새롭게 배열 정비해서 시작
//        //System.arraycopy(원본배열, 시작위치, 대상배열, 시작위치, 길이)
//
//        for (int i = 0; i < completion.length; i++) { //완주자 명단으로 비교
//            for (int j = 0; j < participant.length; j++) { //참가자명단 다 검사
//                if (participant.length != 1) {
//                    if (participant[j].equals(completion[i])) {
//                        //System.out.println(" 완주자[" + i + "]" + completion[i] + " 참가자[" + j + "] : " + participant[j]);
//                        participant[j] = participant[participant.length - 1]; //마지막 배열 값을 현재 배열에 집어 넣기
//                        String[] tempArr = new String[participant.length - 1];
//                        System.arraycopy(participant, 0, tempArr, 0, participant.length - 1);
//                        //System.out.println("tempArr : " + tempArr.length);
//                        participant = new String[tempArr.length];
//                        System.arraycopy(tempArr, 0, participant, 0, tempArr.length);
//                        //System.out.println("participant : " + participant.length);
//                        i = 0;
//                        break;
//                    }
//                }
//            }
//        }
//        //System.out.println(participant[0]);
