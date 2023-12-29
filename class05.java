import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class05 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("donkey.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int charCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.contains("我有一隻小毛驢")) {
                    System.out.println(line);
                    charCount += line.length();
                }
            }

            bufferedReader.close();

            System.out.println("Total characters read: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
