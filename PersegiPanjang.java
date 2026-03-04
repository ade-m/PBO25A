public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang(){}
    public PersegiPanjang(int panjang, int lebar){
       this.panjang=panjang;
       this.lebar=lebar;
    }
    public int hitungLuas(){
        return panjang*lebar;
    }
    public int hitungKeliling(){
        return (2*panjang)+(2*lebar);
    }
    public static int hitungKeliling(int panjang, 
                                    int lebar){
        return (2*panjang)+(2*lebar);
    }

    public void setPanjang(int panjang){
        this.panjang=panjang;
    }

    public int getPanjang(){
        return panjang;
    }

    public void setLebar(int lebar){
        this.lebar=lebar;
    }

    public int getLebar(){
        return lebar;
    }
}
