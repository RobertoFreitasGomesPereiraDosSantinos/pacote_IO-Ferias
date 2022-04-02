package fileIO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File fil = new File("Cacete.txt");
        try {
            System.out.println(fil.createNewFile());
            boolean exists = fil.exists();
            System.out.println("Pode ser lido? "+fil.canRead());
            System.out.println("Nome: "+fil.getPath());
            System.out.println("ultima modificação: "+new Date(fil.lastModified()));
            if (exists) {
                System.out.println("deletado? "+fil.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
