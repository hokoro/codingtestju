public class phonenumbersecret {
    /*전화번호가 문자열 phone_number로 주어졌을 때,
    전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
    solution을 완성해주세요.*/
    public static String solution(String phone_number) {
        String answer = "";

        // 전체 길이에서 뒤에 4자리를 substring으로 분리
        String info = phone_number.substring(phone_number.length()-4);

        // 4자리를 뺸 나머지를 길이만 큼 * 모양을 만듬
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < phone_number.length()-4; i++){
            sb.append("*");
        }


        // 둘이 합친다.

        sb.append(info);

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }


}
