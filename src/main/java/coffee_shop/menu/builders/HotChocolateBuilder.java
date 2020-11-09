package coffee_shop.menu.builders;

import coffee_shop.Beverage;

public interface HotChocolateBuilder {
    Beverage make();
    HotChocolateBuilder withCream();
    HotChocolateBuilder withCinnamon();
}
