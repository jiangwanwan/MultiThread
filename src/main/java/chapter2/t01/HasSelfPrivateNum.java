package chapter2.t01;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class HasSelfPrivateNum {
    public void addI(String username){

        try {
            int num = 0;

            if ("a".equals(username)){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
