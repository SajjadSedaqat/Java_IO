import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        File file = new File("src/main/resources/RandomAccessText.txt");

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            //Each line include 10 visible character and 2 invisible character \n new line characters
            randomAccessFile.seek(12 * 4);
            int i = randomAccessFile.read();
            while (i != -1) {
                System.out.print((char) i);
                i = randomAccessFile.read();
            }
            //Hear we are changing position of the pointer again
            randomAccessFile.seek(12 * 4);
            int j = randomAccessFile.read();
            while (j != -1) {
                System.out.print((char) j);
                j = randomAccessFile.read();
            }
            randomAccessFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
