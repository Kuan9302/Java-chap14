import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class02 {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = ""; 

        try {
            System.out.print("Input a string: ");
            str = buf.readLine(); 
        } catch (IOException e) {
            e.printStackTrace();
        }

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string = " + upperCaseStr);
    }
}
