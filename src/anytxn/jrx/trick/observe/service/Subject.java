package anytxn.jrx.trick.observe.service;

/**
 * @ClassName Subject.java
 * @Author trick
 * @Version 1.0.0
 * @Description 被观察者
 * @CreateTime 2020年04月06日 00:01:00
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
