package org.poc.chain.of.responsibility.usecase;

import org.poc.chain.of.responsibility.actions.DiscountToFiveOrMoreItems;
import org.poc.chain.of.responsibility.actions.DiscountToFiveOrMoreItemsAndOrdersGreaterOrEqualThanFiftyReais;
import org.poc.chain.of.responsibility.actions.DiscountToOrdersGreaterOrEqualThanFiftyReais;
import org.poc.chain.of.responsibility.actions.NoDiscount;
import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

public class ApplyDiscount {
    public static void execute(Order order) {
        Discount discount = new DiscountToFiveOrMoreItemsAndOrdersGreaterOrEqualThanFiftyReais(
                new DiscountToOrdersGreaterOrEqualThanFiftyReais(
                        new DiscountToFiveOrMoreItems(
                                new NoDiscount()
                        )
                )
        );

        System.out.printf("Final order amount is R$ %s%n", discount.execute(order));
    }
}
