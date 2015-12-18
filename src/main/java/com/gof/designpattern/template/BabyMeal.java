package com.gof.designpattern.template;

/**
 * Created by yl3 on 18.12.15.
 */
public class BabyMeal extends Meal {
    @Override
    void breakfast() {
        System.out.println("Baby drink milch for breakfast.");
    }

    @Override
    void lunch() {
        System.out.println("Baby eat brei for lunch.");
    }

    @Override
    void dinner() {
        System.out.println("Baby drink milch for dinner.");
    }
}
