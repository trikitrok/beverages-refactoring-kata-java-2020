package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class CreamSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCream(beverage);
    }
}
