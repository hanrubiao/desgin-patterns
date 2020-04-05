package anytxn.jrx.trick.stratege.service;

/**
 * @ClassName Duck.java
 * @Author trick
 * @Version 1.0.0
 * @Description duck 类
 * @CreateTime 2020年04月05日 20:34:00
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    public abstract void perform();

    public void fly(){
        flyBehavior.fly();
    }

}
