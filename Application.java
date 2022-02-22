import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        CaesarsCipher ep = new CaesarsCipher();
        ep.encrypt();
        ep.decrypt();
    }
}
