package com.ruleengine.example;

public class DiscountRange200To300 implements Discounts {
    private double discount;

    @Override
    public boolean evaluate(double cartTotal) {
        boolean evalResult = false;
        if (cartTotal >= 200.0 && cartTotal < 300.0) {
            this.discount = cartTotal * 0.20;
            evalResult = true;
        }
        return evalResult;
    }

    @Override
    public Discount getDiscount() {
        return new Discount(discount);
    }
}
