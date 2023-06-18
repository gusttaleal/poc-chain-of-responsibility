package org.poc.chain.of.responsibility.entity;

import java.math.BigDecimal;

public abstract class Discount {
    private final BigDecimal rate;

    public Discount(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal execute(Order order) {
        return order.getAmount().subtract(order.getAmount().multiply(rate));
    }

    public BigDecimal next(Discount discount, Order order) {
        return discount.execute(order);
    }
}
