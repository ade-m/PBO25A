import java.util.Date;
public class Praktikum {
    private String namaMatakuliah;
    private Date jadwal;
    private String lokasi;
    private AsistenDosen asistenDosen;

    public Praktikum(){}
    public Praktikum(String namaMatakuliah,
        Date jadwal, String lokasi, 
        AsistenDosen asistenDosen){
            this.namaMatakuliah=namaMatakuliah;
            this.jadwal=jadwal;
            this.lokasi=lokasi;
            this.asistenDosen=asistenDosen;
    }

    public String getNamaMatakuliah() {
        return this.namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public Date getJadwal() {
        return this.jadwal;
    }

    public void setJadwal(Date jadwal) {
        this.jadwal = jadwal;
    }

    public String getLokasi() {
        return this.lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public AsistenDosen getAsistenDosen() {
        return this.asistenDosen;
    }

    public void setAsistenDosen(AsistenDosen asistenDosen) {
        this.asistenDosen = asistenDosen;
    }

    @Override
    public String toString(){
        return namaMatakuliah +"\t"+
                jadwal +"\t"+
                lokasi +"\t"+
                asistenDosen.getNama();
    }
}
