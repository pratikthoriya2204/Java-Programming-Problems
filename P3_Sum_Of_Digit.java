import java.util.Scanner;
public class P3_Sum_Of_Digit {
    public static void main(String[] args) {
        int sum=0,num,digit;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
        scanner.close();
    }
}
