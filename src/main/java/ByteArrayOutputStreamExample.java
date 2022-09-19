import java.io.*;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout1=new FileOutputStream("src/main/resources/byteArrayOutputStream1.txt");
        FileOutputStream fout2=new FileOutputStream("src/main/resources/byteArrayOutputStream2.txt");

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();//has no effect
        System.out.println("Success...");
    }
}

