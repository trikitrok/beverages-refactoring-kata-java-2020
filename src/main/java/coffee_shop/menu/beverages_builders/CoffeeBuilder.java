package coffee_shop.menu.beverages_builders;

import coffee_shop.Beverage;

public interface CoffeeBuilder {
    Beverage make();
    CoffeeBuilder withMilk();
    CoffeeBuilder withCream();
    CoffeeBuilder withCinnamon();
}
