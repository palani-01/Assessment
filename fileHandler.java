import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class fileHandler {
    public static void main(String[] args) {
        try {
            File obj = new File("file.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Files in Java");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("file.txt",true);
            fw.write(" are exciting");
            fw.close();
            System.out.println("Successfully appended to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            char[] array = new char[100];
            String name = "file.txt";
            FileReader input = new FileReader(name);
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
