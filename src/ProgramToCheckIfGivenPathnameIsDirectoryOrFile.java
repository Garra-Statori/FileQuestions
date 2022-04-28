import java.io.File;
public class ProgramToCheckIfGivenPathnameIsDirectoryOrFile {

    public static void main(String[] args) {
        File my_file = new File("C:\\Users\\garra\\.cache");
        if (my_file.isDirectory()) {
            System.out.println(my_file.getAbsolutePath() + " is directory.\n");
            }
        else {
            System.out.println(my_file.getAbsolutePath() + "not directory.\n");
        }
        if (my_file.isFile()) {
            System.out.println(my_file.getAbsolutePath() + " is file.\n");
        }
        else {
            System.out.println(my_file.getAbsolutePath() + " is not a file");
        }
    }

}
