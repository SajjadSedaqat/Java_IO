import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        String name = "Sajjad";
        File file = new File("src/main/resources/object.txt");
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(name);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
