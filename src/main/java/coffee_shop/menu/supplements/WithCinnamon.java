package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class WithCinnamon implements Beverage {
    private Beverage beverage;

    public WithCinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
