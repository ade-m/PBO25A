package Game;

public class Creep extends Enemy implements Mask,Gaunlet {
    @Override
    public void serang(){
        System.out.println("Creep serang");
        System.out.println("Creep meledak");
        this.mati();
    }
    @Override
    public void invisible(){
        System.out.println("Creep menghilang");
    }
    @Override
    public void imortality(){
        System.out.println("Creep tidak terkalahkan");
    }
}
