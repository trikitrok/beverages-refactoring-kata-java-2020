package coffee_shop.menu.beverages_machine;

import coffee_shop.Beverage;

public interface TeaBuilder {
    Beverage make();
    TeaBuilder withMilk();
    TeaBuilder withCinnamon();
}
