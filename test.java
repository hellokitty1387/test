import java.util.Scanner;
public class Main {
    public static String send (String s){
        if(s.indexOf(" ")==-1){
            return s;
        }
        else{
            return s.substring(0,s.indexOf(" "));
        }
    }
    public static void main(String[] args) {
        boolean nam = false;
        boolean pas = false;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b;
        int spacef = a.indexOf(" ");
        int spaceb = a.lastIndexOf(" ");
        String name;
        String pass;
        if(spacef==-1 || spaceb+1==a.length()){
            b = sc.nextLine();
            name = send(a);
            pass = send(b);
        }
        else {
            name = a.substring(0,spacef);
            pass = a.substring(spaceb+1);
        }
 
        if(name.equals("HelloJava")){
            nam = true;
        }
        if(pass.equals("abc1234")){
            pas = true;
        }
        if (nam && pas){
            System.out.print("登陆成功");
        }
        else if (!nam){
            System.out.print("用户名错误");
        }
        else{
            System.out.print("密码错误");
        }
    }
}
