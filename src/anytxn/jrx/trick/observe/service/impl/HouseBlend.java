package anytxn.jrx.trick.observe.service.impl;

import anytxn.jrx.trick.decorate.service.Berverage;

/**
 * @ClassName HouseBlend.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月07日 21:34:00
 */
public class HouseBlend extends Berverage {

    public HouseBlend() {
        description = "house blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
