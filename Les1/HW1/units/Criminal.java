package HW1.units;

public abstract class Criminal extends BaseHero{

    public Criminal(String name, int minDamage, int maxDamage, int speed, int def, int atack, int x, int y, int side) {
        super(name, 10, minDamage, maxDamage, speed, def, atack, x, y, side);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
        if (!this.die()) {
            this.goAtack(this.SearchNearstEnemy());
        }
    }
}
