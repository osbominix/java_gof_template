package com.gof.designpattern;

import com.gof.designpattern.template.AdultMeal;
import com.gof.designpattern.template.BabyMeal;

/**
 * Created by yl3 on 18.12.15.
 */
public class CommandCenter {

    public static void main(String[] args) {
        BabyMeal babyMeal = new BabyMeal();
        babyMeal.feeding();

        System.out.println();

        AdultMeal adultMeal = new AdultMeal();
        adultMeal.feeding();
    }

}
