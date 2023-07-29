package org.poc.chain.of.responsibility;

import org.poc.chain.of.responsibility.entity.Order;
import org.poc.chain.of.responsibility.usecase.ApplyDiscount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(1))
                .items(4)
                .build());
    }
}