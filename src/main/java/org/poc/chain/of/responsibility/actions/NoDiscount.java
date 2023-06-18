package org.poc.chain.of.responsibility.actions;

import lombok.Builder;
import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

@Builder
public class NoDiscount extends Discount {

    public NoDiscount() {
        super(BigDecimal.ZERO);
    }

    public BigDecimal execute(Order order) {
        return super.execute(order);
    }
}
