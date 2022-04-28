import java.io.*;

public class JavaProgramToReadFirstThreeLinesFromAFile {

    public static void main(String[] args) {


        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\garra\\OneDrive\\Documents\\A programmer\\2-21-2022.docx"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");


            }
    }

    }


