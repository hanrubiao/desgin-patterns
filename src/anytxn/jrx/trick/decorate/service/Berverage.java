package anytxn.jrx.trick.decorate.service;

/**
 * @ClassName Berverage.java
 * @Author trick
 * @Version 1.0.0
 * @Description 装饰模式
 * @CreateTime 2020年04月07日 21:31:00
 */
public abstract class Berverage {

    public String description = "unkonow beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();


}
