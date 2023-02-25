package HW1.units;

public class Peasant extends BaseHero {
    protected int delivery;

    public Peasant(String name) {
        super(name, 1, 1, 1, 3, 1, 1);
        this.delivery = 1;
    }

    @Override
    public void die() {
    }

}
