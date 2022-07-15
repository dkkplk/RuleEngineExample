package com.ruleengine.example;

public interface Discounts {
    boolean evaluate(double cartTotal);

    Discount getDiscount();
}
