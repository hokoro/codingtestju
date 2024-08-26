public class year2016 {
    public static String solution(int a, int b) {
        String answer = "";
        int [] year = {0,31,29,31,30,31,30,31,31,30,31,30,31};  // 월별 일수(2016)
        // 2016년은 366일 = 52주 + 2일
        String []days = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; // 요일
        int start = 5;
        int daySum = 0;

        for(int i = 0; i < a; i++){
            daySum += year[i];
        }

        daySum += b;

        int week = daySum / 7;  // 1월 1일을 기준으로 목표 주차
        int r = daySum % 7 - 1; // 1월1일을 기준으로 목표까지 나머지 일수


        start += r;

        answer = days[start %7];

        return answer;
    }

    public static void main(String[] args) {

        // 20주 + 5일
        int a = 5;
        int b = 24;

        System.out.println(solution(a,b));
    }
}
