package HW1;

import HW1.units.BaseHero;
import HW1.units.Crossbowman;
import HW1.units.Magician;
import HW1.units.Monk;
import HW1.units.Outlaw;
import HW1.units.Peasant;
import HW1.units.Sniper;
import HW1.units.Spearman;

public class Game {
    public static void main(String[] args) {
        BaseHero ps = new Peasant("Nik");
        BaseHero cbm = new Crossbowman("Arbaletchik");
        BaseHero mag = new Magician("CherniyMag");
        BaseHero mk = new Monk("Monach");
        BaseHero ol = new Outlaw("Razbinik");
        BaseHero sr = new Sniper("Snayper");
        BaseHero sm = new Spearman("Kopeyshik");
        System.out.println(ps.getInfo());
        System.out.println(cbm.getInfo());
        System.out.println(mag.getInfo());
        System.out.println(mk.getInfo());
        System.out.println(ol.getInfo());
        System.out.println(sr.getInfo());
        System.out.println(sm.getInfo());
    }

}
