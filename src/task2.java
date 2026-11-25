public class task2 {
    public static void main(String[] args){
        int[][] arr = {
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.println(arr[1][2]);

        arr[0][1]= 99;

        for(int i =0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
