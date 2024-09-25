import java.util.Scanner;

public class pattern2 {

    public static void pattern2(int n){
        int i,j;

        for(i=1;i<=n;i++){
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
        System.out.println("Enetr a Number :- ");
        int n = sc.nextInt();
        System.out.println("Show Your Patterns ");
        pattern2(n);
    }
}


// Output
// *
// **
// ***
// ****
// *****