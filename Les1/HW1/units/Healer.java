package HW1.units;

public abstract class Healer extends BaseHero {
    protected int magic;

    public Healer(String name, int minDamage, int maxDamage, int speed, int def, int atack) {
        super(name, 30, minDamage, maxDamage, speed, def, atack);
        this.magic = 1; 
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getInfo() {
        return String.format("%s  Magic: %d", super.getInfo(), this.magic);
    }

    @Override
    public void die() {
        // TODO Auto-generated method stub
        
    }
    
}
