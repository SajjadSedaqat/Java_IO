import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        File file = new File("src/main/resources/object.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            System.out.println(objectInputStream.readObject());
            objectInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
