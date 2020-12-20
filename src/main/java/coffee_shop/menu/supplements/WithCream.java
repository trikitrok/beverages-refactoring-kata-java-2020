package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

class WithCream implements Beverage {
    private Beverage beverage;

    WithCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.15;
    }
}
