package anytxn.jrx.trick.stratege.service;

/**
 * @ClassName Duck.java
 * @Author trick
 * @Version 1.0.0
 * @Description duck 抽象类
 * @CreateTime 2020年04月05日 20:34:00
 */
public abstract class Duck {

    //子类拥有所有权
    protected FlyBehavior flyBehavior;

    public abstract void perform();

    //动态改变行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

}
