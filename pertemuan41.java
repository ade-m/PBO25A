public class pertemuan41 {
    public static void main(String[] args) {
        PersegiPanjang p1 = 
            new PersegiPanjang(5,10);
        System.out.println("Lebar :"+p1.getLebar());
        p1.setLebar(20);
        System.out.println("Lebar :"+p1.getLebar());
        int keliling = p1.hitungKeliling();
        System.out.println("Keliling Persegi Panjang:"+
                            keliling);  
        java.lang.Math.sqrt(144); 
        keliling = PersegiPanjang
                .hitungKeliling(5, 40); 
        System.out.println("Keliling Persegi Panjang:"+
            keliling);  
        
        PersegiPanjang p2 = 
                new PersegiPanjang(55,10);
        keliling = p2.hitungKeliling();        
        System.out.println("Keliling Persegi Panjang:"+
            keliling); 
    }
}
