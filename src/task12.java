public class task12 {
    public static void main(String[] args) {
        int[][] grades = {
                {80, 90, 75, 85},
                {95, 88, 92, 90},
                {70, 78, 82, 74}
        };

        int max = grades[0][0];
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                int score = grades[i][j];
                studentSum += score;
                totalSum += score;
                totalCount++;

                if (score > max) {
                    max = score;
                }
            }
            double studentAvg = (double) studentSum / grades[i].length;
            System.out.println("Student " + i + " average: " + studentAvg);
        }

        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAvg);
    }
}

