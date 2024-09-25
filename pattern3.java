import java.util.Scanner;

public class pattern3 {

    public static void pattern3(int n){
        int i,j;
        for(i=n;i>=1;i--){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n = sc.nextInt();
        pattern3(n);
    }
}
// Output
// *****
//  ****
//   ***
//    **
//     *