package HW1.units;

public abstract class Archer extends BaseHero{
    protected int shoots;
    public Archer(String name, int hp, int minDamage, int maxDamage, int speed, int def, int atack, int shoots) {
        super(name, hp, minDamage, maxDamage, speed, def, atack);
        this.shoots = shoots;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void die() {
        // TODO Auto-generated method stub
        
    }

    
}
