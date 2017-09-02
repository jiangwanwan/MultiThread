package chapter2.t06;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * synchronized (this)代码块是锁定当前对象
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);

        thread1.start();
        thread2.start();
    }
}
