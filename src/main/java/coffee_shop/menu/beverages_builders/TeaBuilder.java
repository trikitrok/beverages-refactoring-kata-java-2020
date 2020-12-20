package coffee_shop.menu.beverages_builders;

import coffee_shop.Beverage;

public interface TeaBuilder {
    Beverage make();
    TeaBuilder withMilk();
    TeaBuilder withCinnamon();
}
