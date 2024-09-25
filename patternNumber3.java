import java.util.Scanner;

public class patternNumber3 {
    public static void patternNumber3(int n) {
        int i, j;
        int rowCount = 1;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n = sc.nextInt();
        patternNumber3(n);
    }
}
// output
// 1
// 1 2 1 
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1