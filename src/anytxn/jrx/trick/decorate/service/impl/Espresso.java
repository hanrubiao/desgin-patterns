package anytxn.jrx.trick.decorate.service.impl;

import anytxn.jrx.trick.decorate.service.Berverage;

/**
 * @ClassName Espresso.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月07日 21:33:00
 */
public class Espresso extends Berverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
