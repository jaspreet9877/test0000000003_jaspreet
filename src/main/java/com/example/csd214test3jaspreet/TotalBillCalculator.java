package com.example.csd214test3jaspreet;

public class TotalBillCalculator {
    private static final double XL_PIZZA_PRICE = 15.00;
    private static final double L_PIZZA_PRICE = 12.00;
    private static final double M_PIZZA_PRICE = 10.00;
    private static final double S_PIZZA_PRICE = 8.00;
    private static final double TOPPING_PRICE = 1.50;
    private static final double HST_RATE = 0.15;

    public static double calculateTotalBill(String pizzaSize, int numberOfToppings) {
        double pizzaPrice = 0;

        switch (pizzaSize) {
            case "XL":
                pizzaPrice = XL_PIZZA_PRICE;
                break;
            case "L":
                pizzaPrice = L_PIZZA_PRICE;
                break;
            case "M":
                pizzaPrice = M_PIZZA_PRICE;
                break;
            case "S":
                pizzaPrice = S_PIZZA_PRICE;
                break;
            default:
                System.out.println("Invalid pizza size!");
                break;
        }

        double toppingsCost = numberOfToppings * TOPPING_PRICE;
        double subTotal = pizzaPrice + toppingsCost;
        double hst = subTotal * HST_RATE;
        double totalBill = subTotal + hst;

        return totalBill;
    }

}