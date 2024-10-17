public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 8;
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        printPascalsTriangle(triangle);
    }

    public static void printPascalsTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
