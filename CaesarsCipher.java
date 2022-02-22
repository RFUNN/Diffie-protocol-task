import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CaesarsCipher {
    public void encrypt() throws IOException {
        Scanner user_input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int SymmetricKey;
        System.out.print("Enter the symmetric key: ");
        SymmetricKey = user_input.nextInt();

        System.out.print("Enter the phrase you want to encrypt: ");
        String Phrase1 = reader.readLine();

        char[] chars = Phrase1.toCharArray();
        StringBuilder Phrase2 = new StringBuilder();
        for (byte b = 0; b < chars.length; b++){
            chars[b] = (char) (chars[b] + SymmetricKey);
            Phrase2.append(chars[b]);
        }

        System.out.println("Your encrypted phrase: " + Phrase2);
    }
    public void decrypt() throws IOException {
        Scanner user_input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int SymmetricKey;
        System.out.print("Enter the symmetric key: ");
        SymmetricKey = user_input.nextInt();

        System.out.print("Enter the phrase you want to decrypt: ");
        String Phrase1 = reader.readLine();

        char[] chars = Phrase1.toCharArray();
        StringBuilder Phrase2 = new StringBuilder();
        for (byte b = 0; b < chars.length; b++){
            chars[b] = (char) (chars[b] - SymmetricKey);
            Phrase2.append(chars[b]);
        }

        System.out.println("Your decrypted phrase: " + Phrase2);
    }
}
