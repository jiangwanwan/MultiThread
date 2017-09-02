package chapter1.t12;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 优先级具有规则性
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++){
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(10);
            myThread1.start();

            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(1);
            myThread2.start();
        }
    }
}
