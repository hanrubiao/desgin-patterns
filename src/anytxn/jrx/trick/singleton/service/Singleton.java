package anytxn.jrx.trick.singleton.service;

/**
 * @ClassName Singleton.java
 * @Author trick
 * @Version 1.0.0
 * @Description 单例类
 * @CreateTime 2020年04月05日 20:13:00
 */
public class Singleton {
    private volatile static Singleton uniqueSingleton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueSingleton == null){
            synchronized (Singleton.class){
                if(uniqueSingleton == null){
                    uniqueSingleton = new Singleton();
                }
            }
        }
        return uniqueSingleton;
    }
}
