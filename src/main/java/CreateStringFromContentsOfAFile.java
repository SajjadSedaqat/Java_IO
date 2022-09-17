import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateStringFromContentsOfAFile {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\src/main/resources/test.txt";
        Charset encoding = Charset.defaultCharset();

        //First Way
        List<String> listLines = Files.readAllLines(Paths.get(path), encoding);
        System.out.println(listLines);
        //Second Way
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String stringLines = new String(encoded, encoding);
        System.out.println(listLines);


    }
}
