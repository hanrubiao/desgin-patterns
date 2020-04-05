package anytxn.jrx.trick.stratege.service.impl;

import anytxn.jrx.trick.stratege.service.Duck;

/**
 * @ClassName DuckImpl.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月05日 21:25:00
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void perform() {
        flyBehavior.fly();
    }
}
