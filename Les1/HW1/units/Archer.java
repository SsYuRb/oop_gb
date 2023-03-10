package HW1.units;

public abstract class Archer extends BaseHero {
    protected int shoots;

    public Archer(String name, int hp, int minDamage, int maxDamage, int speed, int def, int atack, int shoots, int x,
            int y, int side) {
        super(name, hp, minDamage, maxDamage, speed, def, atack, x, y, side);
        this.shoots = shoots;
        // TODO Auto-generated constructor stub
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
        if (!this.die() && this.shoots > 0) {
            this.goAtack(this.SearchNearstEnemy());
            if (!SearchPeasant()) {
                this.shoots -= 1;
            }
        }
    }

    private boolean SearchPeasant() {
        boolean k = false;
        for (BaseHero baseHero : allHeroes) {
            if (baseHero.side == this.side && baseHero.getClass().getSimpleName() == "Peasant") {
                if (((Peasant) baseHero).stand == 0) {
                    k = true;
                    ((Peasant) baseHero).stand = 1;
                    break;
                }
            }
        }
        return k;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + atack +
                " Dmg:" + Math.round(Math.abs((minDdamage+maxDamage)/2)) +
                " Shots:" + shoots + " " + leaving(die());
    }

}
