package Relasi;

public class Pertemuan71 {
    public static void main(String[] args) {
        Engine e = new Engine();
        Mobil toyota = new Mobil();
        toyota.setEngine(e);
        toyota.start();
        toyota.run();
        toyota.stop();
    }
}
