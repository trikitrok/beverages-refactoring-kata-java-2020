package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class MilkSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithMilk(beverage);
    }

    static class WithMilk implements Beverage {
        private final Beverage beverage;

        WithMilk(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double price() {
            return beverage.price() + 0.10;
        }
    }
}
