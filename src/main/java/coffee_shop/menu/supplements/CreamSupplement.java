package coffee_shop.menu.supplements;

import coffee_shop.Beverage;

public class CreamSupplement implements Supplement {
    @Override
    public Beverage add(Beverage beverage) {
        return new WithCream(beverage);
    }

    static class WithCream implements Beverage {
        private Beverage beverage;

        WithCream(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double price() {
            return beverage.price() + 0.15;
        }
    }
}
