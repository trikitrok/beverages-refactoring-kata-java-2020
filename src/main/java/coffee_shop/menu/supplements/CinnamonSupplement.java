package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class CinnamonSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCinnamon(beverage);
    }

    static class WithCinnamon implements Beverage {
        private Beverage beverage;

        WithCinnamon(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double price() {
            return beverage.price() + 0.05;
        }
    }
}
