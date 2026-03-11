package Relasi;

public class Mobil {
    private int status;
    public void start(Engine e){
        e.start();
        status=1;
    }
    public void stop(Engine e){
        e.stop();
        status=0;
    }
    public void run(){
        if(status==1)
        System.out.println("Mobil berjalan");
    }
}
