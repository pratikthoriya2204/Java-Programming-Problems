import java.util.Scanner;
public class P5_chack_vowel_Consonent {

    static void checkVorC(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ){
            System.out.println("This number is VOWEL");
        }else{
            System.out.println("This number is Consonent..");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
                                // here this is the indexing of the element to take //
        checkVorC(c);
        sc.close();
    }
}
