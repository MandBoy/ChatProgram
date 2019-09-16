import java.util.*;
import java.io.*;


public class Login{
    private String userName;
    private String passWord;

    public Login(boolean go) throws FileNotFoundException{
        while(go){
            login();
        }
    }
    public void login() throws FileNotFoundException{
        System.out.print("Enter UserName: "); this.userName = Inputhandler.strChoice();
        System.out.print("Enter Password: "); this.passWord = Inputhandler.strChoice();
        checkLogin(userName, passWord);
    }
    public static boolean checkLogin(String userName, String passWord) throws FileNotFoundException{
        File file = new File("users.txt");
        Scanner scanner = new Scanner(file);

    }

}
