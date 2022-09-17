import java.io.File;

public class FileClass {
    public static void main(String[] args) {

        // create a file object for this location
        File file = new File("src/main/resources/newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
