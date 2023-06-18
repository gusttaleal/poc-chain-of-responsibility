package org.poc.chain.of.responsibility.actions;

import lombok.Builder;
import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;
@Builder
public class DiscountToOrdersGreaterOrEqualThanFiftyReais extends Discount {
    private final Discount discount;

    public DiscountToOrdersGreaterOrEqualThanFiftyReais(Discount discount) {
        super(new BigDecimal("0.10"));
        this.discount = discount;
    }

    public BigDecimal execute(Order order) {
        if (order.getAmount().compareTo(new BigDecimal(50)) >= 0) return super.execute(order);
        return super.next(discount, order);
    }
}
