import java.util.*;

public class Parkmoney {

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        int basicTime = fees[0];
        int basicPay = fees[1];
        int partTime = fees[2];
        int partPay = fees[3];

        HashMap<String , String> carState = new HashMap<>();
        HashMap<String , Integer> timeSum = new HashMap<>();

        for(int i = 0; i < records.length; i++){
            String[] info = records[i].split(" ");
            String time = info[0];
            String carNumber = info[1];
            String isIn = info[2];

            if(!carState.containsKey(carNumber)){
                timeSum.put(carNumber , 0);
                if(isIn.equals("IN")){
                    carState.put(carNumber , time);
                }
            }else{
                if(carState.get(carNumber).isEmpty() && isIn.equals("IN")){
                    carState.put(carNumber , time);
                }

                if(!carState.get(carNumber).isEmpty() && isIn.equals("OUT")){
                    String[] inTime = carState.get(carNumber).split(":");
                    String[] outTime = time.split(":");
                    int[] inTimeInt = new int[2];
                    int[] outTimeInt = new int[2];
                    if(inTime[0].charAt(0) == '0'){
                        inTime[0] = String.valueOf(inTime[0].charAt(1));
                    }
                    if(inTime[1].charAt(0) == '0'){
                        inTime[1] = String.valueOf(inTime[1].charAt(1));
                    }

                    if(outTime[0].charAt(0) == '0'){
                        outTime[0] = String.valueOf(outTime[0].charAt(1));
                    }
                    if(outTime[1].charAt(0) == '0'){
                        outTime[1] = String.valueOf(outTime[1].charAt(1));
                    }

                    inTimeInt[0] = Integer.parseInt(inTime[0]);
                    inTimeInt[1] = Integer.parseInt(inTime[1]);
                    outTimeInt[0] = Integer.parseInt(outTime[0]);
                    outTimeInt[1] = Integer.parseInt(outTime[1]);

                    if(outTimeInt[1] < inTimeInt[1]){
                        outTimeInt[0]--;
                        outTimeInt[1] += 60;
                    }
                    int sum = 0;
                    sum += ((outTimeInt[0] - inTimeInt[0]) * 60) + ((outTimeInt[1] - inTimeInt[1]));
                    timeSum.put(carNumber , timeSum.get(carNumber) + sum);

                    carState.put(carNumber , "");
                }
            }
        }
        for(String car : carState.keySet()){
            if(!carState.get(car).isEmpty()){
                int sum = 0;
                int h = 23;
                int m = 59;

                String[] timeInfo = carState.get(car).split(":");
                if(timeInfo[0].charAt(0) == '0'){
                    timeInfo[0] = String.valueOf(timeInfo[0].charAt(1));
                }
                if(timeInfo[1].charAt(0) == '0'){
                    timeInfo[1] = String.valueOf(timeInfo[1].charAt(1));
                }

                int h2 = Integer.parseInt(timeInfo[0]);
                int m2 = Integer.parseInt(timeInfo[1]);

                sum = ((h - h2) * 60) + (m - m2);

                timeSum.put(car , timeSum.get(car) + sum);
                carState.put(car , "");
            }

        }

        answer = new int[timeSum.size()];
        String[] keys = timeSum.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        for(int i = 0; i < keys.length; i++){
            String key = keys[i];
            int time = timeSum.get(key);
            if(time <= basicTime){
                answer[i] = basicPay;
                continue;
            }else{
                int sum = basicPay + (int)(Math.ceil((double) (time - basicTime) / partTime) * partPay);
                answer[i] = sum;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        int []fees = {180, 5000, 10, 600};
        String []records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(solution(fees , records)));
    }
}
