package fileIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StremsTest {
    public static void main(String[] args) throws IOException{
        gravador();
        leitor();
    }
    private static void gravador() {
        try (BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream("nicolau.txt"))) {
            byte [] dados = {80,61,92,83,114,65};
            bufout.write(dados);
            bufout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void leitor() {
        try (FileInputStream fiin = new FileInputStream("nicolau.txt");) {
            int leitura;
            while ((leitura = fiin.read()) != -1) {
                byte let = (byte) leitura;
                System.out.println(let);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
