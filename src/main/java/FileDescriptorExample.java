import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorExample {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/descriptor.txt");
        FileOutputStream fos1 = new FileOutputStream(file);
        FileDescriptor fd = fos1.getFD();
        //passing FileDescriptor to another  FileOutputStream
        FileOutputStream fos2 = new FileOutputStream(fd);
        fos2.write("Hello World!".getBytes());
        fos1.close();
        //If close the for one of them it will be close for both of them
        System.out.println(fd.valid());
        fos2.close();

        //Using for FileInputStream
/*      File file = new File("src/main/resources/descriptor.txt");
        FileInputStream fis1 = new FileInputStream(file);
        FileDescriptor fd = fis1.getFD();
        //passing FileDescriptor to another  FileInputStream
        FileInputStream fis2 = new FileInputStream(fd);
        int i=0;
        while((i=fis2.read())!=-1){
            System.out.print((char)i);
        }
        fis1.close();
        fis2.close();*/

    }
}
