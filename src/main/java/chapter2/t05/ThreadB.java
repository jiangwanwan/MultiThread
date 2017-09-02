package chapter2.t05;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class ThreadB extends Thread{
    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
