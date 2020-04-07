package anytxn.jrx.trick.tst;

import anytxn.jrx.trick.singleton.service.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName SingletonTst.java
 * @Author trick
 * @Version 1.0.0
 * @Description 单例模式
 * @CreateTime 2020年04月07日 21:59:00
 */
public class SingletonTst {

  public static void main(String[] args) {
      //利用多线程打印单例
      ExecutorService executorService = Executors.newFixedThreadPool(10);
      for(int i=0;i<10;i++){
          executorService.submit(() -> {
              System.out.println(Singleton.getInstance());
          });
      }
  }
}
