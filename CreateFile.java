import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {        
            File dokumenSaya = 
                new File("Dokumen.txt");
            if(dokumenSaya.createNewFile()){
                System.out.println
                    ("Dokumen berhasil dibuat");
            }
            else{
                System.out.println
                    ("Dokumen sudah ada");
            }
        } catch (IOException e) {
           System.out.println
            ("Terjadi kesalah pada pembuatan file");
        }
    }
}
