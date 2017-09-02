package chapter2.t03;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
