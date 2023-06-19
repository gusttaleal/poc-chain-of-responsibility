package org.poc.chain.of.responsibility.actions;

import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

public class DiscountToFiveOrMoreItems extends Discount {
    public DiscountToFiveOrMoreItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal discountRate() {
        return new BigDecimal("0.10");
    }

    @Override
    protected Boolean discountRule(Order order) {
        return order.getItems().compareTo(5) >= 0;
    }
}
