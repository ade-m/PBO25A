package siak;

public class Dosen {
    private String kdDosen;
    private String namaDosen;
    private String[] nimMahasiswa;
    private int jlhMahasiswa;

    public Dosen() {
    }


    public Dosen(String kdDosen, String namaDosen, 
    String[] nimMahasiswa, int jlhMahasiswa) {
        this.kdDosen = kdDosen;
        this.namaDosen = namaDosen;
        this.nimMahasiswa = nimMahasiswa;
        this.jlhMahasiswa = jlhMahasiswa;
    }



    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKdDosen() {
        return this.kdDosen;
    }

    public void setKdDosen(String kdDosen) {
        this.kdDosen = kdDosen;
    }

    public String[] getNimMahasiswa() {
        return this.nimMahasiswa;
    }

    public void setNimMahasiswa(String[] nimMahasiswa) {
        this.nimMahasiswa = nimMahasiswa;
    }

    public int getJlhMahasiswa() {
        return this.jlhMahasiswa;
    }

    public void setJlhMahasiswa(int jlhMahasiswa) {
        this.jlhMahasiswa = jlhMahasiswa;
    }

    @Override
    public String toString() {
        return "{" +
            " kdDosen='" + getKdDosen() + "'" +
            ", namaDosen='" + getNamaDosen() + "'" +
            ", nimMahasiswa='" + getNimMahasiswa() + "'" +
            ", jlhMahasiswa='" + getJlhMahasiswa() + "'" +
            "}";
    }
    
}
