import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        try {
            File myFile = new File("myfile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File Created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
   