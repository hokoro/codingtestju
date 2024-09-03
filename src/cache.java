import java.util.*;
public class cache {

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0){
            answer += (cities.length * 5);
            return answer;
        }
        ArrayList<String> cityCache = new ArrayList<>();
        for(int i = 0; i < cities.length; i++){
            cities[i] = cities[i].toLowerCase();
            if(cityCache.size() < cacheSize){
                if(!cityCache.contains(cities[i])){
                    cityCache.add(cities[i]);
                    answer+=5;
                }else{
                    String city = cityCache.remove(cityCache.indexOf(cities[i]));
                    cityCache.add(city);
                    answer++;
                }
            }else{
                if(!cityCache.contains(cities[i])){
                    cityCache.remove(0);
                    cityCache.add(cities[i]);
                    answer+=5;
                }else{
                    String city = cityCache.remove(cityCache.indexOf(cities[i]));
                    cityCache.add(city);
                    answer++;
                }

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int cacheSize = 3;
        String []cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize , cities));
    }
}
