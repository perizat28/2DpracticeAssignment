public class task5 {
    public static void main(String[] args){
        int[][] a ={
                {3, 8, 10, 7},
                {-20, 2, 7, 4},
                {8, 0, 13, -3}
        };
        int min = a[0][0];
        int max= a[0][0];

        for(int i=0; i <a.length; i++){
            for(int j=0; j< a[i].length; j++){
                if(a[i][j]< min){
                    min = a[i][j];
                }
                if(a[i][j]> max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Min: " + min);

        System.out.println("Max: "+ max);
    }
}
