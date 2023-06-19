package org.poc.chain.of.responsibility.actions;

import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal discountRate() {
        return BigDecimal.ZERO;
    }

    @Override
    protected Boolean discountRule(Order order) {
        return true;
    }
}
