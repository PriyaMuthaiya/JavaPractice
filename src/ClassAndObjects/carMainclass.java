package ClassAndObjects;

public class carMainclass {
    public static void main(String[] args) {

        //ferrari is first object
        CarClass ferrari=new CarClass();
        ferrari.name="ferrari xo";
        ferrari.year=22024;
        ferrari.Model="2.8";
        System.out.println(ferrari.name+ferrari.Model+ferrari.year);
/// creating second object of the class where passing the value in the constructor
        CarClass swift=new CarClass("swfit 2.0",2018,"fg");
        System.out.println(swift.name);
        System.out.println(swift.year);
        System.out.println(swift.Model);


    }
}
