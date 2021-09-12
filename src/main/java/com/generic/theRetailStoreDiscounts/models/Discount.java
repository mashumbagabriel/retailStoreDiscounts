package com.generic.theRetailStoreDiscounts.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
public abstract class Discount {
    private BigDecimal discountRate;
}
