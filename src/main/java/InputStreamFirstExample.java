import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamFirstExample {
    public static void main(String[] args) throws Exception {
        byte[] array;

        try{
            InputStream input = new FileInputStream("src/main/resources/input.txt");
            System.out.println("Available bytes in the file: " + input.available());
            //Create an array with the same size of available bytes
            array = new byte[input.available()];

            //Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            //Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
