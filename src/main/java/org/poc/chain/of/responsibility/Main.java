package org.poc.chain.of.responsibility;

import org.poc.chain.of.responsibility.entity.Order;
import org.poc.chain.of.responsibility.usecase.ApplyDiscount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(25))
                .items(4)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(25))
                .items(5)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(25))
                .items(6)
                .build());

        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(250))
                .items(4)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(250))
                .items(5)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(250))
                .items(6)
                .build());

        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(25))
                .items(1)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(50))
                .items(1)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(100))
                .items(1)
                .build());

        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(25))
                .items(10)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(50))
                .items(10)
                .build());
        ApplyDiscount.execute(Order.builder()
                .amount(new BigDecimal(100))
                .items(10)
                .build());
    }
}