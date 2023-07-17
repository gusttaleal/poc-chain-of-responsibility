package org.poc.chain.of.responsibility.entity;

import java.math.BigDecimal;

public enum DiscountRate {
    STATUS_APPROVE,
    FIVE_OR_MORE_ITEMS,
    FIVE_OR_MORE_ITEMS_AND_ORDER_GREATER_OR_EQUAL_FIFTY_REAIS,
    ORDER_GREATER_OR_EQUAL_FIFTY_REAIS,
    NO_DISCOUNT;

    public BigDecimal getValue() {
        return switch (this) {
            case STATUS_APPROVE -> new BigDecimal("0.05");
            case FIVE_OR_MORE_ITEMS -> new BigDecimal("0.10");
            case ORDER_GREATER_OR_EQUAL_FIFTY_REAIS -> new BigDecimal("0.15");
            case FIVE_OR_MORE_ITEMS_AND_ORDER_GREATER_OR_EQUAL_FIFTY_REAIS -> new BigDecimal("0.20");
            case NO_DISCOUNT -> BigDecimal.ZERO;
        };
    }
}
