import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class class11 {
    public static void main(String[] args) {
        writeData("rand99.txt");

        cnt("rand99.txt");
    }

    public static void writeData(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                char randomChar = (char) ('a' + random.nextInt(26));
                fos.write(randomChar);
            }
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cnt(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

            int data;
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                switch (ch) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                }
            }

            System.out.println("Occurrences of a: " + aCount);
            System.out.println("Occurrences of e: " + eCount);
            System.out.println("Occurrences of i: " + iCount);
            System.out.println("Occurrences of o: " + oCount);
            System.out.println("Occurrences of u: " + uCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
