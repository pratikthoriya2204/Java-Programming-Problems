import java.util.Scanner;

public class patternNumber1 {

    public static void patternNumber1(int n){
      int i,j;

      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            System.out.print(j);
         }
         System.out.println();
      }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n = sc.nextInt();
        patternNumber1(n);
     }   
}
// output
// 1
// 12
// 123
// 1234
// 12345