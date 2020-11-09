package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class CinnamonSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCinnamon(beverage);
    }
}
