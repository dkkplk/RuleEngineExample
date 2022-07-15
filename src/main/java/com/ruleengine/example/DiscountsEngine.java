package com.ruleengine.example;

import java.util.ArrayList;
import java.util.List;

public class DiscountsEngine {
    static List<Discounts> discountsList = new ArrayList<>();

    static {
        discountsList.add(new DiscountRange100To200());
        discountsList.add(new DiscountRange200To300());
        discountsList.add(new DiscountRange300());
    }

    public Discount process(double cartTotal) {
        Discounts discount = discountsList.stream()
                .filter(r -> r.evaluate(cartTotal))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Expression does not matches any discount model"));
        return discount.getDiscount();
    }
}
