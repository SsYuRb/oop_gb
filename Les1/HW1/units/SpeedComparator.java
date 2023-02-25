package HW1.units;

import java.util.Comparator;

public class SpeedComparator implements Comparator<BaseHero>{
    
    @Override
    public int compare(BaseHero o1, BaseHero o2) {
        return Integer.compare(o1.speed, o2.speed);
    }
}
