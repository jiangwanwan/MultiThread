package chapter1.t12;

import java.util.Random;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();

        long addResult = 0;
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 5000; i ++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("thread 1 use time = " + (endTime-beginTime));
    }
}
