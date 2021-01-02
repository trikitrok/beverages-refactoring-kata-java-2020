package unit_tests;

import beverages.*;

import beverages.BeverageMachine;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = BeverageMachine.coffee().make();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = BeverageMachine.tea().make();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = BeverageMachine.hotChocolate().make();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = BeverageMachine.tea().withMilk().make();
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_tea_with_cinnamon() {
        Beverage teaWithCinnamon = BeverageMachine.tea().withCinnamon().make();
        Assert.assertThat(teaWithCinnamon.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_and_cinnamon() {
        Beverage teaWithMilkAndCinnamon = BeverageMachine.tea().withMilk().withCinnamon().make();
        Assert.assertThat(teaWithMilkAndCinnamon.price(), is(closeTo(1.65,0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeWithMilk = BeverageMachine.coffee().withMilk().make();
        assertThat(coffeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = BeverageMachine.coffee().withMilk().withCream().make();
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = BeverageMachine.hotChocolate().withCream().make();
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price() {
        Beverage coffeeWithCinamon = BeverageMachine.coffee().withCinnamon().make();
        Assert.assertThat(coffeeWithCinamon.price(), is(closeTo(1.25, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cinnamon_price() {
        Beverage hotChocolateWithCinnamon = BeverageMachine.hotChocolate().withCinnamon().make();
        Assert.assertThat(hotChocolateWithCinnamon.price(), is(closeTo(1.50,0.001)));
    }
}
