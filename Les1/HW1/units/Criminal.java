package HW1.units;

public abstract class Criminal extends BaseHero {

    public Criminal(String name, int minDamage, int maxDamage, int speed, int def, int atack, int x, int y, int side) {
        super(name, 10, minDamage, maxDamage, speed, def, atack, x, y, side);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
        if (!this.die()) {
            if (this.coords().distance(this.SearchNearstEnemy().coords()) > 2) {
                Point2D point = this.coords().choiceWay(this.SearchNearstEnemy().coords());
                if (Math.abs(point.x) > Math.abs(point.y)) {
                    if (point.x < 0) {
                        this.x += 1;
                    } else if (point.x > 0) {
                        this.x -= 1;
                    }
                } else {
                    if (point.y < 0) {
                        this.y += 1;
                    } else if (point.y > 0) {
                        this.y -= 1;
                    }
                }
            }
            this.goAtack(this.SearchNearstEnemy());
        }
    }
}
