import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class class09 {
    public static void main(String[] args) {
        String aContent = readFile("a.txt");
        String bContent = readFile("b.txt");

        String cContent = aContent + bContent;
        writeFile("c.txt", cContent);

        System.out.println("a.txt Content:");
        System.out.println(aContent);
        

        System.out.println("b.txt Content:");
        System.out.println(bContent);
        

        System.out.println("c.txt Content:");
        System.out.println(cContent);
    }

    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
