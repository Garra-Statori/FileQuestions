import java.io.File;
public class WriteAJavaProgramToCheckIfFileSpecifiedByPathNameExists {

    public static void main(String[] args) {
        File my_file_dir = new File("C:\\Users\\garra\\.cache");
        if (my_file_dir.exists()) {
            System.out.println("Exists.\n");
        }
        else {
            System.out.println("Does not exist.\n");
        }
    }

}
