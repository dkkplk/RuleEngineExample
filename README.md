Problem


 
 Public double getDiscount(int cartTotal) {
 
        double discount = 0;
        if (cartTotal > 100 && cartTotal < 200) {
            discount = cartTotal * 0.10;
        } else if (cartTotal > 200 && cartTotal < 300) {
            discount = cartTotal * 0.20;
        } else if (cartTotal > 300) {
            discount = cartTotal * 0.30;
        }
        return discount;
    }


Refactor or rewrite the able code without ElseIf cluse or use Object orianted design.
Solution:

The repository code is solution of above problem
