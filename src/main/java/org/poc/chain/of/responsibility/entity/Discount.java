package org.poc.chain.of.responsibility.entity;

import java.math.BigDecimal;

public abstract class Discount {
    private final Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal execute(Order order) {
        if (discountRule(order))
            return order.getAmount().subtract(order.getAmount().multiply(this.discountRate()));
        return nextDiscount.execute(order);
    }

    protected abstract BigDecimal discountRate();

    protected abstract Boolean discountRule(Order order);
}
