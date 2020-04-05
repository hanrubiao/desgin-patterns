package anytxn.jrx.trick.stratege.service.impl;

import anytxn.jrx.trick.stratege.service.FlyBehavior;

/**
 * @ClassName FlyBehaviorImpl.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月05日 21:22:00
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
