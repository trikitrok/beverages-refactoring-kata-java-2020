package beverages.menu.supplements;

import beverages.Beverage;
import beverages.Supplement;

public class MilkSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithMilk(beverage);
    }
}
