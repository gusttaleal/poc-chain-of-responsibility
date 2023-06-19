package org.poc.chain.of.responsibility.actions;

import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

public class DiscountToFiveOrMoreItemsAndOrdersGreaterOrEqualThanFiftyReais extends Discount {
    public DiscountToFiveOrMoreItemsAndOrdersGreaterOrEqualThanFiftyReais(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal discountRate() {
        return new BigDecimal("0.20");
    }

    @Override
    protected Boolean discountRule(Order order) {
        return order.getItems().compareTo(5) >= 0 && order.getAmount().compareTo(new BigDecimal(50)) >= 0;
    }
}
