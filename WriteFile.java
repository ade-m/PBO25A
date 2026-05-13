import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter dokumenSaya = 
                new FileWriter("Dokumen.txt");
            dokumenSaya.write("Praktikum PBO 1\n");
            dokumenSaya.write("Praktikum PBO 2");
            dokumenSaya.close();
            //tambahkan Praktikum PBO 9
            FileWriter editDokumen =
                new FileWriter("Dokumen.txt",
                true);
            editDokumen.write("\nPraktikum PBO 9");
            editDokumen.close();
        } catch (IOException e) {
            System.out.println
                ("Terjadi kesalah saat menulis file");
        }
    }
}
