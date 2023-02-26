package HW1.units;

public abstract class Archer extends BaseHero{
    protected int shoots;
    public Archer(String name, int hp, int minDamage, int maxDamage, int speed, int def, int atack, int shoots, int x, int y, int side) {
        super(name, hp, minDamage, maxDamage, speed, def, atack, x, y, side);
        this.shoots = shoots;
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean die() {
        // TODO Auto-generated method stub
        if (this.hp <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        super.step();
        if (!die() && this.shoots > 0){
            this.goAtack(this.SearchNearstEnemy());
            if (!SearchPeasant()){
                this.shoots -= 1;
            }
        }
    }

    private boolean SearchPeasant(){
        boolean k = false;
        for (BaseHero baseHero : allHeroes) {
            if (baseHero.side == this.side && baseHero.getClass().getSimpleName() == "Peasant"){
                k = true;
            } 
        }
        return k;
    }

    
}
