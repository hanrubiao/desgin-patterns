package anytxn.jrx.trick.stratege.service.impl;

import anytxn.jrx.trick.stratege.service.FlyBehavior;

/**
 * @ClassName FlyNoWay.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月05日 21:36:00
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
