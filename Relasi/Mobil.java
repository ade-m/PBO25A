package Relasi;

public class Mobil {
    private Engine e;
    private int status;
    public Mobil(){
        e = new Engine();
    }
    public void setEngine(Engine e){
        this.e=e;
    }
    public void start(){
        e.start();
        status=1;
    }
    public void stop(){
        e.stop();
        status=0;
    }
    public void run(){
        if(status==1)
        System.out.println("Mobil berjalan");
    }
}
