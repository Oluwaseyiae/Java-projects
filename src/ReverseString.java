import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();


        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

    }
}