package com.gof.designpattern.template;

/**
 * Created by yl3 on 18.12.15.
 */
public abstract class Meal {

    abstract void breakfast();
    abstract void lunch();
    abstract void dinner();

    public final void feeding() {
        breakfast();
        lunch();
        dinner();
    }


}
