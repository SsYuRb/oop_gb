package HW1.units;

public abstract class Healer extends BaseHero {
    protected int magic;

    public Healer(String name, int minDamage, int maxDamage, int speed, int def, int atack, int x, int y, int side) {
        super(name, 30, minDamage, maxDamage, speed, def, atack, x, y, side);
        this.magic = 1; 
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getInfo() {
        return String.format("%s  Magic: %d", super.getInfo(), this.magic);
    }


    
}
