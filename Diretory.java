package fileIO;

import java.io.File;

public class Diretory {
    public static void main(String[] args) throws Exception {
        File dir = new File("pastaFoda");
        dir.mkdir();
        File arc = new File(dir, "tapoia.txt");
        arc.createNewFile();
        File rename = new File(dir, "renomado.txt");
        arc.renameTo(rename);
    }
}
