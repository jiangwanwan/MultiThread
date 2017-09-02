package chapter2.t06;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread2 extends Thread{
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
