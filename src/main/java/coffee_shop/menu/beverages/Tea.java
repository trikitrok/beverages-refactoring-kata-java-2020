package coffee_shop.menu.beverages;

import coffee_shop.Beverage;

public class Tea implements Beverage {
    @Override
    public double price() {
        return 1.5;
    }
}
