package anytxn.jrx.trick.decorate.service.impl;

import anytxn.jrx.trick.decorate.service.Berverage;
import anytxn.jrx.trick.decorate.service.CondimentDecorator;

/**
 * @ClassName Mocha.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月07日 21:38:00
 */
public class Mocha extends CondimentDecorator {

    private Berverage berverage;

    public Mocha(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.description + ", Mocha";
    }

    @Override
    public double cost() {
        return berverage.cost() + .20;
    }
}
