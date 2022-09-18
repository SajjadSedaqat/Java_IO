import java.io.*;
import java.util.Scanner;

public class ReadContentOfFileLineByLine {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/input.txt");
/*        // Creates a FileInputStream
        FileInputStream fileInputStream = new FileInputStream(file);
        // Creates a BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // Reads first byte from file
        int i = bufferedInputStream.read();

        while (i != -1) {
            System.out.print((char) i);
            // Reads next byte from the file
            i = bufferedInputStream.read();
        }
        bufferedInputStream.close();*/

/*        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i = bufferedReader.read();

        while (i != -1) {
            System.out.print((char) i);
            i = bufferedReader.read();
        }
        bufferedReader.close();*/

        Scanner scanner = new Scanner(file);

        System.out.println("Read File using Scanner: ");

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }
        scanner.close();





    }
}
