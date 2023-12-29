import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class04 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("donkey.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int charCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                charCount += line.length(); 
            }

            bufferedReader.close();

            System.out.println("Total characters read: " + charCount);
            // (b) 一樣，因為我是每一行計算字元(包括ASCII字符和Unicode字符)

        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }
}
