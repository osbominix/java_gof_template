package com.gof.designpattern.template;

/**
 * Created by yl3 on 18.12.15.
 */
public class AdultMeal extends Meal {
    @Override
    void breakfast() {
        System.out.println("Adult eat bread for breakfast.");
    }

    @Override
    void lunch() {
        System.out.println("Adult eat menu for lunch.");
    }

    @Override
    void dinner() {
        System.out.println("Adult eat salat for dinner.");
    }
}
