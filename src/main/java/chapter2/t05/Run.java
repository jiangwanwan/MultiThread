package chapter2.t05;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * synchronized代码块间的同步性
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
