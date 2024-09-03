public class P4_Sum_Of_Matrix {

    public static int sumofdigit(int n,int m , int mat[][]){
        int i,sum=0;
        for( i=0; i< n;i++){
            for (int j = 0; j < m; j++) {
                sum+=mat[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
     int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
     int n = mat.length;
     int m = mat[0].length;   

     System.out.println(sumofdigit(n, m, mat));
    }
}
