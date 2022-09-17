import java.nio.file.Paths;

public class JavaProgramToGetCurrentWorkingDirectory {
    public static void main(String[] args) {
        // Get current working directory using System.getProperty()
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);
        // Get current working directory using Path
        String path2 = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path2);



    }
}
