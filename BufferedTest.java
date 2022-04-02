package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Pombo.txt");
        try {
            BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
            bufw.write("ecrevando em prtugays");
            bufw.newLine();
            bufw.write("eita bixo sexo kkkkkkkkkkkkkkkkkk");
            bufw.flush();
            bufw.close();
            BufferedReader bufr = new BufferedReader(new FileReader(file));
            String str;
            while ((str = bufr.readLine()) != null) {
                System.out.println(str);
            }
            bufr.close();
            System.out.println(file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
