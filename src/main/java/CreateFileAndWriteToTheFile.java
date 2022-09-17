import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateFileAndWriteToTheFile {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/main/resources/newFile.txt";

        //New way
        try {
            Files.createFile(Paths.get(path));
        } catch (IOException e) {
            boolean b = e.getClass().isAssignableFrom(FileAlreadyExistsException.class);
            if(b) System.out.println("File already exist");

        }

        // create a file object for the current location
        File file = new File("/src/main/resources/newFile.txt");

        try {

            // create a new file with name specified
            // by the file object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("New Java File is created.");
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
