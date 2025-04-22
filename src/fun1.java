public class fun1 {

    public static void main(String[] args) {
    greet();
    String name=name();
        System.out.println(name);
        greetWithNameandAge("priya","30");
        int sum=sum(2,4);
        System.out.println(sum);
    }
    /*static void main(){
    }*/
    static void greet() //no arg and with no return type
    {
       System.out.println("HEllo");
    }
    static String name(){
        return "priya";
    }
    //with parameter without returing the value
    static void greetWithNameandAge(String name,String age){
        System.out.println("Hi my name is "+name+" and i am  "+age);

    }
    //with param/argument and with return type
    static int sum(int a, int b){
        return a+b;
    }

}
