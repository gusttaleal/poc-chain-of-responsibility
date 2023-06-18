package org.poc.chain.of.responsibility.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Order {
    private BigDecimal amount;
    private Integer items;

}
