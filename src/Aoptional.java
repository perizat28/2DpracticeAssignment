public class Aoptional {
    public static void main(String[] args) {
        int[][] a = {
                {100, 8, 3, 4},
                {10, 20, 5, 2},
                {3, 4, 1, 6}
        };
        int maxSum = 0;
        int bestRow = 0;

        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            if (i == 0 || rowSum > maxSum) {
                maxSum = rowSum;
                bestRow = i;
            }
        }

        System.out.println("Row: " + bestRow + ", sum: " + maxSum);
    }
}

