public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                { -1, 0, 2, 0 },
                { 3, -1, 0, 0 },
                { 1, 1, -1, 0 },
                { 1, 0, 0, -1 }
        };

        // 대각선 위쪽 요소 출력
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}