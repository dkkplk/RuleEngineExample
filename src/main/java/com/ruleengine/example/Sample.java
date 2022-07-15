package com.ruleengine.example;

public class Sample {

    public static void main(String[] args) {
        double cartTotal = 400;

        DiscountsEngine discountsEngine = new DiscountsEngine();
        Discount discount = discountsEngine.process(cartTotal);
        System.out.println(discount.getValue());
    }
}
