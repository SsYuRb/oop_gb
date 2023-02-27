package HW1.units;

public class Peasant extends BaseHero {
    protected int delivery;
    protected int stand;

    public Peasant(String name, int x, int y, int side) {
        super(name, 1, 1, 1, 3, 1, 1, x, y, side);
        this.delivery = 1;
        this.stand = 0;
    }

    @Override
    public boolean die() {
        // TODO Auto-generated method stub
        if (this.hp <= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
        if (!this.die()){
            this.stand = 0;
        }
    }

}
