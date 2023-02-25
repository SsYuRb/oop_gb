package HW1.units;

public class Healer extends BaseHero {
    protected int healed;

    public Healer(String name, int hp, int damage, int healed) {
        super(name, hp, damage, 2, 4);
        this.healed = healed;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Healing: %d", super.getInfo(), this.healed);
    }

    @Override
    public void die() {
        // TODO Auto-generated method stub
        
    }
    
}
