public class P7_Dimond_Shape {
    public static void main(String[] args) {
        int i,j;

        for (i=1;i<=5;i++){
            for (int k=1;k<= 5-i;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (i=5;i>=1;--i){
            for (int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

// output :- 


//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *