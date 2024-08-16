import java.io.*;
import java.util.*;

public class    bandage_level1 {
    /*
    * t초 동안 붕대를 감으면 1초마다 x만틈 회복한다
    * t초 연속으로 붕대를 감은거에 성공하면 y만큼 추가로 회복한다.
    * 게임 캐릭터는 현재 체력보다 최대체력을 넘을수 없다.
    *
    * 기술을 쓰는 도중 공격을 당하면 체력 회복이 불가
    * 몬스터에게 공격을 당해 기술이 취소되거나 기술이 끝나면 그 즉시 붕대감기를 사용해 연속 성공시간이 0으로 초기화 된다.
    * 공격당하면 피해량 만큼 현재 체력이 달아진다. 죽으면 더이상 회복 안됨
    * */
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = 0;
        int maxHealth = health;
        boolean attackBool = false;
        int stack = 0; // 연속 성공 시간
        ArrayList<int[]> attackList = new ArrayList<>(Arrays.asList(attacks));
        ArrayList<Integer>attackTimes = new ArrayList<>();

        for(int i = 0; i < attacks.length; i++){
            attackTimes.add(attacks[i][0]);
        }

        // 첫번쨰 원소를 오름차순으로 정렬
        attackList.sort(Comparator.comparingInt((int[] arr) -> arr[0]));

        // 최대 시간을 = 정렬후 마지막 시간으로 초기화
        int endTime = attackList.get(attackList.size()-1)[0];

        while (true){
            attackBool = false;
            if(attackTimes.contains(time)){
                System.out.println("데미지: " + attacks[attackTimes.indexOf(time)][1]);
                health -= attacks[attackTimes.indexOf(time)][1];
                stack = 0;
                attackBool = true;
            }

            if(health < maxHealth && !attackBool){
                if(stack == bandage[0]){
                    health+=(bandage[2]);
                    stack = 0;
                }
                health+=(bandage[1]);
            }

            System.out.println("현재 시간: " + time + " 현재 건강 : " + health + " 스택: " + stack);

            if(health > maxHealth){ // 최대체력을 넘어가면 초기화
                health = maxHealth;
            }
            if(health <= 0){     // 체력이 0보다 작아 죽을경우
                answer = -1;
                break;
            }
            if(time == endTime){
                answer = health;
                break;
            }
            stack++;
            time++;
        }

        return answer;
    }


    public static void main(String[] args) {
        int [] bandage = {5, 1, 5};
        int health = 30;
        int [][]attacks = {{11, 5},{2, 10},{9, 15},{10, 5}};

        System.out.println(solution(bandage , health , attacks));


        int [] bandage2 = {3,2,7};
        int health2 = 20;
        int [][]attacks2 = {{1,15},{5,16},{8,6}};

        System.out.println(solution(bandage2 , health2 , attacks2));
    }
}
