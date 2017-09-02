package chapter2.t07;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
