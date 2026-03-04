import java.util.Date;

public class Pertemuan42 {
    public static void main(String[] args) {
        AsistenDosen dhea = new AsistenDosen(
            "241712001", "Dhea", 
            'A', 2024);
        AsistenDosen nita = new AsistenDosen(
            "241712002", "Bearnita", 
            'A', 2024);
        System.out.println(dhea);
        System.out.println(nita);
        Praktikum pbo1 = new Praktikum("PBO",
         new Date(), "Lab MIPA B", dhea);
        Praktikum sbd1 = new Praktikum("SBD",
         new Date(), "Lab MIPA A", nita); 
        System.out.println(pbo1);
        System.out.println(sbd1);
        
    }
}
