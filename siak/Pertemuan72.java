package siak;

public class Pertemuan72 {
    public static void main(String[] args) {
        Mahasiswa jono = new Mahasiswa
                    ("01", "Jono");

        Dosen setiawan = 
            new Dosen
            ("11","Setiawan", 
                new String[] {"01","02"},
                2);
        System.out.println(jono);
        //System.out.println(steve);
        System.out.println(setiawan);
    }
}
