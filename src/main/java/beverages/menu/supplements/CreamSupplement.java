package beverages.menu.supplements;

import beverages.Beverage;
import beverages.Supplement;

public class CreamSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCream(beverage);
    }
}
