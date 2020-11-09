package beverages.menu;

import beverages.Beverage;

public interface HotChocolateBuilder {
    Beverage make();
    HotChocolateBuilder withCream();
    HotChocolateBuilder withCinnamon();
}
