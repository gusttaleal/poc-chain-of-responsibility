package org.poc.chain.of.responsibility.actions;

import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.DiscountRate;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

public class DiscountToOrdersGreaterOrEqualThanFiftyReais extends Discount {
    public DiscountToOrdersGreaterOrEqualThanFiftyReais(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal discountRate() {
        return DiscountRate.ORDER_GREATER_OR_EQUAL_FIFTY_REAIS.getValue();
    }

    @Override
    protected Boolean doesOrderMeetDiscountRule(Order order) {
        return order.getAmount().compareTo(new BigDecimal(50)) >= 0;
    }
}
