package chapter2.t06;

import chapter2.t05.ThreadB;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Task {
    public void otherMethod(){
        System.out.println("========================run other method=======================");
    }

    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 1000; i ++){
                System.out.println("synchronized threadName= " + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
