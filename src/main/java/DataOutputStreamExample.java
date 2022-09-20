import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dataOutputStream.txt");
        try {
            file.createNewFile();
            OutputStream outputStream = new FileOutputStream(file);
            //Why can't we just use fileOutputStream.write()
            //Because this way we are writing bytes not the actual value;
            //and we cant save for example double as double we can save as text but not double
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeInt(65);
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            int number = dataInputStream.readInt();
            System.out.println(number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
