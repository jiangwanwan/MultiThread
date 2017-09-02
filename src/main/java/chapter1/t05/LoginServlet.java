package chapter1.t05;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class LoginServlet {
    private static String username;
    private static String password;

    public static void doPost(String username, String password){
        try {
            username = username;
            if ("a".equals(username)){
                Thread.sleep(5000);
            }
            password = password;
            System.out.println("username = " + username + " password = " + password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
