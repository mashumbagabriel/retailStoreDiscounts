package com.generic.theRetailStoreDiscounts.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
public class EmployeeDiscount extends Discount {

    @Value("${discount.employee.rate}")
    private BigDecimal discountRate;

    @Override
    public BigDecimal getDiscountRate(){

        return this.discountRate;
    }
}
