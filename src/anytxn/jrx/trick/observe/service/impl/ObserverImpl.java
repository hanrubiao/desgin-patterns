package anytxn.jrx.trick.observe.service.impl;

import anytxn.jrx.trick.observe.service.Observer;
import anytxn.jrx.trick.observe.service.Subject;

/**
 * @ClassName ObserverImpl.java
 * @Author trick
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年04月06日 00:25:00
 */
public class ObserverImpl implements Observer {

    private Subject subject;

    public ObserverImpl(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
