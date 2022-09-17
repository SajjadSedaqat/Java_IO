import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConvertFileToByteArrayAndViceVersa {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/main/resources/test.txt";


        //New way of converting file to bytes
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(encoded));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Old way of converting files to bytes
        try {
            FileInputStream inputStream = new FileInputStream(path);
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            inputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String finalPath = System.getProperty("user.dir") + "/src/main/resources/final.txt";
        //New way of saving bytes to file
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalPath), encoded);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Old way of writing bytes to file
        try {
            //We use append in constructor if we want to add to the file
            FileOutputStream fileOutputStream = new FileOutputStream(finalPath);
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            fileOutputStream.write(encoded);

            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
