public class task3 {
    public static void main(String[] args){
        int[][] a={
                {5, 8, 9},
                {3, 0, 2},
                {-3, -5, 0}
        };
        int sum = 0;
        for (int i=0; i< a.length; i++){
            for(int j=0; j< a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}
