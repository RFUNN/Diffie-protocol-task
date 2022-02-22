import java.util.Scanner;

public class SymmetricKey {
    public void getKey(){
        Scanner user_input = new Scanner(System.in, "Cp1251");

        double Number1;
        System.out.print("What number did the interlocutor choose: ");
        Number1 = user_input.nextDouble();

        double Number2;
        System.out.print("Now, you choose a number: ");
        Number2 = user_input.nextDouble();

        double PrivateKey;
        System.out.print("Enter your private key: ");
        PrivateKey = user_input.nextDouble();

        double PublicKey1 = Math.pow(Number2, PrivateKey) % Number1;
        String PublicKeyOut = String.format("%.0f", PublicKey1);
        System.out.println("Your public key: " + PublicKeyOut);

        double PublicKey2;
        System.out.print("Enter enter the interlocutor's public key: ");
        PublicKey2 = user_input.nextDouble();

        double SymmetricKey = Math.pow(PublicKey2, PrivateKey) % Number1;
        String SymmetricKeyOut = String.format("%.0f", SymmetricKey);
        System.out.println("Your symmetric key: " + SymmetricKeyOut);
    }
}
