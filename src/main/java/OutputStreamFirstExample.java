import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamFirstExample {

    public static void main(String[] args) {
        String data = "This line of text will be added to the file";

        try {
            OutputStream out = new FileOutputStream("src/main/resources/output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
