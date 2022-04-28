
import java.io.File;
import java.util.Date;

public class ListOfAllFileDirectoryNames {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\garra\\IdeaProjects\\ArrayVsArrayList");
        String[] fileList = file.list();
        for(String name:fileList) {
            System.out.println(name);
        }

    }

}
