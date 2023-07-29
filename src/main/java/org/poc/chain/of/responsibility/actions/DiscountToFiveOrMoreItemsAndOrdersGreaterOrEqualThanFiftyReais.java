package org.poc.chain.of.responsibility.actions;

import org.poc.chain.of.responsibility.entity.Discount;
import org.poc.chain.of.responsibility.entity.DiscountRate;
import org.poc.chain.of.responsibility.entity.Order;

import java.math.BigDecimal;

public class DiscountToFiveOrMoreItemsAndOrdersGreaterOrEqualThanFiftyReais extends Discount {

    @Override
    protected BigDecimal discountRate() {
        return DiscountRate.FIVE_OR_MORE_ITEMS_AND_ORDER_GREATER_OR_EQUAL_FIFTY_REAIS.getValue();
    }

    @Override
    protected Boolean doesOrderMeetDiscountRule(Order order) {
        return order.getItems().compareTo(5) >= 0 && order.getAmount().compareTo(new BigDecimal(50)) >= 0;
    }
}
