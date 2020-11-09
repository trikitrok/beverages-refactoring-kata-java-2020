package coffee_shop.menu.builders;

import coffee_shop.Beverage;

public interface TeaBuilder {
    Beverage make();
    TeaBuilder withMilk();
    TeaBuilder withCinnamon();
}
