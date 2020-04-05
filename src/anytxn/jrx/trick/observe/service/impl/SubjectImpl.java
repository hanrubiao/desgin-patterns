package anytxn.jrx.trick.observe.service.impl;

import anytxn.jrx.trick.observe.service.Observer;
import anytxn.jrx.trick.observe.service.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SubjectImpl.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月06日 00:08:00
 */
public class SubjectImpl implements Subject {

    private List<Observer> observerList;
    private String msg;

    public SubjectImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(msg);
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyObserver();
    }
}
