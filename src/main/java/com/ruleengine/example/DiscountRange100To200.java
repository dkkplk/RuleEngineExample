package com.ruleengine.example;

public class DiscountRange100To200 implements Discounts {
    private double discount;

    @Override
    public boolean evaluate(double cartTotal) {
        boolean evalResult = false;
        if (cartTotal >= 100.0 && cartTotal < 200.0) {
            this.discount = cartTotal * 0.10;
            evalResult = true;
        }
        return evalResult;
    }

    @Override
    public Discount getDiscount() {
        return new Discount(discount);
    }
}
