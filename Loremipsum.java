import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loremipsum {
    public static void main(String[] args) {
        try {
            File file = new File("LOREMIPSUM.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}