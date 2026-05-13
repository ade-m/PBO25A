package Game;

public class Enemy {
    private int skin=1;
    private int x=0;
    private int y=0;
    private int hp =5;
    private int attack=10;


    public Enemy() {
    }

    public Enemy(int skin, int x, int y, int hp, int attack) {
        this.skin = skin;
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.attack = attack;
    }

    public void jalan(){
        System.out.println("Enemy Jalan");
    }
    public void serang(){
        System.out.println("Enemy serang");
    }
    public void mati(){
        System.out.println("Enemy mati");
    }

    public int getSkin() {
        return this.skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}
