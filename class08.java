import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class08 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("proverb.txt"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.contains("You can't be perfect but you can be unique.")) {
                    System.out.println(line);
                }
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
