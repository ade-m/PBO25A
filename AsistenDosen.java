public class AsistenDosen {
    private String nim;
    private String nama;
    private char kom;
    private int angkatan;

    public AsistenDosen(){}
    public AsistenDosen(String nim, String nama,
        char kom, int angkatan){
            this.nim=nim;
            this.nama=nama;
            this.kom=kom;
            this.angkatan=angkatan;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getKom() {
        return this.kom;
    }

    public void setKom(char kom) {
        this.kom = kom;
    }

    public int getAngkatan() {
        return this.angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public String toString(){
        return "Nim\t: "+ nim+"\n"+
                "Nama\t: "+nama+"\n"+
                "Kom\t: "+kom+"\n"+
                "Angkatan: "+angkatan+"\n";
    }
}
