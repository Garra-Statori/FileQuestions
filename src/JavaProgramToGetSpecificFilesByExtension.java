import java.io.File;

public class JavaProgramToGetSpecificFilesByExtension {

    public static void main(String a[]) {

 File directory = new File("C:\\Users\\garra");

 File[] files = directory.listFiles();
        System.out.println("Files\t\t\tExtension");

        for(File file : files) {
            String filename = file.toString();

            int index = filename.lastIndexOf('.');
            if(index > 0) {
                String extension = filename.substring(index + 1);
                System.out.println(file + "\t" + extension);
            }
        }

    }
}