
import java.io.*;
import java.util.*;


public class manygift_level1 {

    /*
    * 선물을 직접 전하기 힘들 때 카카오톡 선물하기 기능을 이용해 축하 선물을 보낼 수 있습니다.
    * 당신의 친구들이 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측하려고 합니다.
    * 규칙
    * 1.두 사람 사이에서 더 많은 선물을 준 사람이 선물을 하나 받는 구조
    * 2.주고 받은 기록이 없거나 주고 받은 선물의 개수가 똑같다면 선물 지수가 큰 사람이 선물 지수가 더 적은 사람에게 선물 하나를 받는다
    * ex) A가 준 선물이 3개이고 받은 선물이 10개이면 선물지수는 3-10 = -7
    * -> 선물 지수 = 준선물 - 받은 선물
    * 3.선물지수가 똑같다면 -> 다음달에 선물을 주고 받지 않는다.
    * */

    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        List<String> friendList = Arrays.asList(friends);
        int [] results = new int[friends.length];

        HashMap<String , int[]> personGiftInfo = new HashMap<>(); // 선물지수 계산 해시 맵
        HashMap<String , int[]> exchangeInfo = new HashMap<>(); // 교환 정보 해시 맵

        for(int i = 0; i < friends.length; i++){
            personGiftInfo.put(friends[i] , new int[3]);    // 준 선물 , 받은 선물 , 선물 지수
            exchangeInfo.put(friends[i] , new int[friends.length]); // key : 준사람 / value : 받은 사람
        }

        for(int i = 0; i < gifts.length; i++){
            StringTokenizer st = new StringTokenizer(gifts[i]);

            String sender = st.nextToken(); // 준 사람
            String recevier = st.nextToken(); // 받은 사람

            personGiftInfo.get(sender)[0]++;    // 준 사람에 데이터 수 증가
            personGiftInfo.get(recevier)[1]++; // 받은 사람의 데이터 수 증가

            exchangeInfo.get(sender)[friendList.indexOf(recevier)]++; // 누구에게 몇개의 선물을 줬는지에 대한 정보
        }

        for(int i = 0; i < friends.length; i++){
            personGiftInfo.get(friends[i])[2] = personGiftInfo.get(friends[i])[0] - personGiftInfo.get(friends[i])[1];  // 선물 지수 계산
        }

        for(int i = 0; i < friends.length; i++){
            String sender = friendList.get(i);  // 발신자 정보

            for(int j = i+1; j < exchangeInfo.size(); j++){
                String recevier = friendList.get(j);
                if(exchangeInfo.get(sender)[j] > exchangeInfo.get(recevier)[i]){
                    results[i]++;   // 송신자가 다음달에 선물을 하나 받음
                } else if (exchangeInfo.get(sender)[j] < exchangeInfo.get(recevier)[i]) {
                    results[j]++; // 수신자가 다음달에 선물을 하나 받음
                }else{
                    if(personGiftInfo.get(sender)[2] < personGiftInfo.get(recevier)[2]){
                        results[j]++;
                    } else if (personGiftInfo.get(sender)[2] > personGiftInfo.get(recevier)[2]) {
                        results[i]++;
                    }else{
                        continue;
                    }
                }

            }

        }

        for(int i = 0; i < friends.length; i++){
            if(answer < results[i]){
                answer = results[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String []friends = {"muzi", "ryan", "frodo", "neo"};
        String []gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends , gifts));
    }
}
