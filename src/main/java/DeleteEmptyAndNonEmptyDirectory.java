import java.io.File;

public class DeleteEmptyAndNonEmptyDirectory {
    public static void main(String[] args) {


//delete an empty directory
/*        try {
            // create a new file object
            File directory = new File("Directory");

            // delete the directory
            boolean result = directory.delete();

            if(result) {
                System.out.println("Directory Deleted");
            }
            else {
                System.out.println("Directory not Found");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }*/

        //delete non-empty directory
      //In Java, to delete a non-empty directory, we must first delete all the files present in the directory.
      // Then, we can delete the directory.
        try {
            // create a new file object
            File directory = new File("Directory");

            // list all the files in an array
            File[] files = directory.listFiles();

            // delete each file from the directory
            for(File file : files) {
                System.out.println(file + " deleted.");
                file.delete();
            }

            // delete the directory
            if(directory.delete()) {
                System.out.println("Directory Deleted");
            }
            else {
                System.out.println("Directory not Found");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
