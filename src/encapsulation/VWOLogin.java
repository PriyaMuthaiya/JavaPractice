package encapsulation;

public class VWOLogin{

    private String username;
    private String password;

    public VWOLogin(String user, String pwd) {
        this.username = user;
        this.password = pwd;
    }

    //encapsulation
     //create private data member /instance variable
    //create constructor to intislize the variable
    //create getter and setter method to access it


    public String getUsername() {
        return username;
    }
    public String setUsername(String user) {
        return this.username=user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd,boolean isAdmin) {
        if(isAdmin){
        this.password = pwd;}
        else{
            System.out.println("Not allowed to set the password");
        }
    }
}
