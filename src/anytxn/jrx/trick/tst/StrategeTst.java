package anytxn.jrx.trick.tst;

import anytxn.jrx.trick.stratege.service.Duck;
import anytxn.jrx.trick.stratege.service.impl.FlyNoWay;
import anytxn.jrx.trick.stratege.service.impl.MallardDuck;
import anytxn.jrx.trick.stratege.service.impl.RedHeadDuck;

/**
 * @ClassName StrategeTst.java
 * @Author trick
 * @Version 1.0.0
 * @Description 策略模式tst
 * @CreateTime 2020年04月05日 21:30:00
 */
public class StrategeTst {

    public static void main(String[] args) {
        //绿头鸭
        Duck mallardDuck = new MallardDuck();
        //改变行为
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.perform();

        //绿头鸭
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.perform();

    }
}
