import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] a = {
                {1, 5, 9},
                {4, 8, 2},
                {7, 3, 6}
        };


        int threshold = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > threshold) {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}

