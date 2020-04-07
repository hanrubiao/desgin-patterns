package anytxn.jrx.trick.tst;

import anytxn.jrx.trick.decorate.service.Berverage;
import anytxn.jrx.trick.decorate.service.impl.Espresso;
import anytxn.jrx.trick.decorate.service.impl.Mocha;
import anytxn.jrx.trick.observe.service.impl.HouseBlend;

/**
 * @ClassName DecorateTst.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月07日 21:40:00
 */
public class DecorateTst {

    public static void main(String[] args) {
        // 利用委托
        Berverage berverage = new Espresso();
        System.out.println(berverage.getDescription() + " $ " + berverage.cost());

        Berverage berverage1 = new HouseBlend();
        berverage1 = new Mocha(berverage1);
        System.out.println(berverage1.getDescription() + "$" + berverage1.cost());
    }
}
