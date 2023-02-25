package HW1.units;

import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int damage;
    protected int speed;
    protected int def;

    public BaseHero(String name, int hp, int damage, int speed, int def) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.damage = damage;
        this.speed = speed;
        this.def = def;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s Damage: %d Defensive: %d Speed: %d",
                this.name, this.hp, this.getClass().getSimpleName(), this.damage, this.def, this.speed);
    }

    protected void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }


}
