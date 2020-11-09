package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class MilkSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithMilk(beverage);
    }
}
