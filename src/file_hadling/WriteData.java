package file_hadling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        File file = new File("studentList.txt");
        try {
            file.createNewFile();

            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Tory\n");
            fileWriter.write("Taylor");

            fileWriter.close();

            Thread.sleep(5000);

        } catch (Exception e) {
        e.printStackTrace();
    }
        finally {
            file.delete();
        }

        System.out.println("End of the program");
    }
}
