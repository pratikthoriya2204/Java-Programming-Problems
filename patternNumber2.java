import java.util.Scanner;

public class patternNumber2 {
    public static void patternNumber2(int n){
        int i,j,count=0;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                count++;
                System.out.print(" "+count+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n = sc.nextInt();
        patternNumber2(n);
    }
}

// output

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
