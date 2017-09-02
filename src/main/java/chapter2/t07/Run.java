package chapter2.t07;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 对象监视器必须是同一个对象时，才会同步；如果不是同一个对象监视器，会异步
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
