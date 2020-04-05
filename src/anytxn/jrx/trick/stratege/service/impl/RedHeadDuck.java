package anytxn.jrx.trick.stratege.service.impl;

import anytxn.jrx.trick.stratege.service.Duck;
import anytxn.jrx.trick.stratege.service.FlyBehavior;

/**
 * @ClassName RedHeadDuck.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月05日 21:38:00
 */
public class RedHeadDuck extends Duck {
    private FlyBehavior flyBehavior;

    public RedHeadDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void perform() {
        flyBehavior.fly();
    }
}
