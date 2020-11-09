package beverages.menu.supplements;

import beverages.Beverage;
import beverages.Supplement;

public class CinnamonSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCinnamon(beverage);
    }
}
