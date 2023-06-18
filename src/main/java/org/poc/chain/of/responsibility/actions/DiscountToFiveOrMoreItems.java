package org.poc.chain.of.responsibility.actions;

import lombok.Builder;
import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;
@Builder
public class DiscountToFiveOrMoreItems extends Discount {
    private final Discount discount;

    public DiscountToFiveOrMoreItems(Discount discount) {
        super(new BigDecimal("0.15"));
        this.discount = discount;
    }

    public BigDecimal execute(Order order) {
        if (order.getItems().compareTo(5) >= 0) return super.execute(order);
        return super.next(discount, order);
    }
}
