import java.io.FileWriter;
import java.io.IOException;

public class class06 {
    public static void main(String[] args) {
        char[] hi = {'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        try {
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write(hi);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
