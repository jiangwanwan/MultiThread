package chapter2.t04;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 不在synchronized块中就是异步执行，在synchronized块中就是同步执行
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++){
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
        }

        System.out.println("");

        synchronized (this){
            for (int i = 0; i < 100; i++){
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
