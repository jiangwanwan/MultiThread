package chapter2.t04;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();
    }
}
