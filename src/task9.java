import java.util.Scanner;
public class task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] a = {
                {10, 20, 30},
                {40, 20, 60},
                {70, 80, 90}
        };
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < a.length && !found; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    System.out.println("Row: " + i + ", Col: " + j);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        scanner.close();
    }
}
