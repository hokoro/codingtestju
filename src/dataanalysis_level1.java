import java.util.*;

/*
* data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후,
* sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요.
* 단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.
*
* */


public class dataanalysis_level1 {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        HashMap<String , Integer> hashMap = new HashMap<>(){{   // 기준이 되는 ext를 해시 맵으로 -> 인덱스를 알기 우히ㅐㅔ
            put("code" , 0);
            put("date",1);
            put("maximum" , 2);
            put("remain",3);
        }};

        int extIdx = hashMap.get(ext);      // 기준 인덱스
        int sortIdx = hashMap.get(sort_by); // 정렬할 인덱스
        ArrayList<ArrayList<Integer>> dataList = new ArrayList<>(); // 몇개가 기준에 해당하는지 모르기 때문에 가변 List로 설정


        for(int i = 0; i<data.length;i++){      // 기준에 해당하는 데이터들 추가
            if(data[i][extIdx] < val_ext){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = 0; j<data[i].length;j++){
                    temp.add(data[i][j]);
                }
                dataList.add(temp);
            }
        }
        // 정렬
        dataList.sort(Comparator.comparingInt((ArrayList<Integer> arrayList) -> arrayList.get(sortIdx)));
        // 반환할 answer 배열 설정
        answer = new int[dataList.size()][dataList.get(0).size()];
        // answer 배열에 추가
        for(int i = 0; i<dataList.size();i++){
            for(int j = 0; j<dataList.get(i).size();j++){
                answer[i][j] = dataList.get(i).get(j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int [][]data = {{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int [][]answer = solution(data, ext, val_ext, sort_by);

        System.out.println(Arrays.deepToString(answer));
    }
}
