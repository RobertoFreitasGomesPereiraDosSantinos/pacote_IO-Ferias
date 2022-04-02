package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderTest {
    public static void main(String[] args) throws Exception {
        File file = new File("Catumba.txt");
        try (FileWriter fiwr = new FileWriter(file);
             FileReader fire = new FileReader(file);) {
                fiwr.write("Menssagem 01 testando testando\nnomes uoto pou agr to marre ne yonkon");
                fiwr.flush();
                char[] carac = new char[100];
                int size = fire.read(carac);
                System.out.println(size);
                for (char c : carac) {
                    System.out.print(c);
            }
        }
    }
}
