package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

class WithCinnamon implements Beverage {
    private Beverage beverage;

    WithCinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
