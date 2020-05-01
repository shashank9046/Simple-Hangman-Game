import java.util.Arrays;
import java.util.Scanner;
public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "Sunil Gavaskar";
        char ch1[] = word.toCharArray();
        int c = 8;
        int x = ch1.length;
        char[] ch2 = new char[x];
        for (int j = 0; j < x; j++) {
            ch2[j] = '_';
        }

        while (!Arrays.equals(ch1, ch2) && c > 0) {
            System.out.println("guess any letter from alaphabet");
            char sb1 = sc.next().charAt(0);
            c--;
            for (int j = 0; j < ch2.length; j++) {
                if (sb1 == ch2[j]) {
                    System.out.println("don't repeat");
                }
            }
            int ascii = sb1;
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                for (int i = 0; i < ch1.length; i++) {
                    if (sb1 == ch1[i]) {
                        ch2[i] = sb1;

                        System.out.println(" keep going");
                        for (int k = 0; k < x; k++) {
                            System.out.print(ch2[k] + " ");

                        }
                        System.out.println(" ");
                    }
                }
            } else {
                System.out.println("this is not a alphabet plz guess again");
            }
            if (!Arrays.equals(ch1, ch2) && c < 8 && c > 0) {
                System.out.println(c + " attempts left go for it you can ");

            }
        }

        if (Arrays.equals(ch1, ch2)) {
            System.out.println(" congratulations you have found the secret word you won ");
        } else {
            System.out.println("sorry to say but you lost you failed to find that secret  word ");
            System.out.println("it was: " + word);
        }
        sc.close();
    }
}
