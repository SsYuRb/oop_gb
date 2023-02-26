package HW1.units;

public class Peasant extends BaseHero {
    protected int delivery;

    public Peasant(String name, int x, int y, int side) {
        super(name, 1, 1, 1, 3, 1, 1, x, y, side);
        this.delivery = 1;
    }

    @Override
    public boolean die() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'die'");
    }

}
