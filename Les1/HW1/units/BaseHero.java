package HW1.units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public abstract class BaseHero implements Interface{
    protected static int number;
    protected static Random r;
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int maxDamage;
    protected int minDdamage;
    protected int atack;
    protected int speed;
    protected int def;
    protected int x;
    protected int y;
    protected int side;
    protected static List<BaseHero> allHeroes = new ArrayList<>();

    public BaseHero(String name, int hp, int minDamage, int maxDamage, int speed, int def, int atack, int x, int y, int side) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.atack = atack;
        this.minDdamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.def = def;
        this.x = x;
        this.y = y;
        this.side = side;
        allHeroes.add(this);
    }

    // protected void healed(int Hp) {
    //     this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    // }

    // protected void getDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    //     else { die(); }
    // }

    protected void goAtack(BaseHero o1) {
        o1.hp = o1.hp - (this.minDdamage + this.maxDamage)/2;
        o1.die();
    }

    protected void Healing (int h) {
        if (this.hp - h <= this.maxHp) {
            this.hp -= h;
        } else if (this.hp - h > this.maxHp) {
            this.hp = this.maxHp;
        }
    }

    protected BaseHero SearchNearstEnemy(){
        HashMap<BaseHero, Double> map = new HashMap<>();
        Double min = 100.0;
        for (BaseHero baseHero : allHeroes) {
            if((this.side != baseHero.side) && !baseHero.die()){
                Point2D pointThis = new Point2D(this.x, this.y);
                Point2D pointEnemy = new Point2D(baseHero.x, baseHero.y);
                Double diss = pointThis.distance(pointEnemy);
                if (diss < min){
                    min = diss;
                }
                map.put(baseHero, diss);
            }
        }
        for (BaseHero key: map.keySet()) {
            if (min.equals(map.get(key))){
                return key;
            }
        }
        return null;
    }

    public boolean die(){
        if (this.hp <= 0) {
            return true;
        } else {
            return false;
        }
    };

    @Override
    public void step() {}

    @Override
    public String getInfo() {
        return String.format("%s Name: %s  Hp: %d  Maximal Damage: %d Defensive: %d Speed: %d Position: (%d, %d)",
                 this.getClass().getSimpleName(), this.name, this.hp, this.maxDamage, this.def, this.speed, this.x, this.y);
    }

    public int getSpeed () {
        return this.speed;
    }

    public int[] getCoords() {return new int[]{this.x, this.y};}

    public float getHp() { return hp;}

    public String leaving (boolean die) {
        if (die) {
            return "Мертв";
        }
        else {
            return "Жив";
        }
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + atack +
                " Dmg:" + Math.round(Math.abs((minDdamage+maxDamage)/2)) +
                " " + leaving(die());
    }

}
