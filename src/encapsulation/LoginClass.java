package encapsulation;

public class LoginClass {
    public static void main(String[] args) {
        VWOLogin v1=new VWOLogin("admin","123");
        v1.setPassword("456",false);
        String pwd=v1.getPassword();
        System.out.println(pwd);
        v1.getUsername();

    }
}

