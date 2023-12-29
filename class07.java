import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class class07 {
    public static void main(String[] args) {
        char[] hi = {'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        String welcome = "Welcome!";

        try {
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write(hi);
            fileWriter.close();

            FileWriter appendWriter = new FileWriter("hello.txt", true);
            appendWriter.write(welcome + "\r\n"); 
            appendWriter.close();

            FileReader fileReader = new FileReader("hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
