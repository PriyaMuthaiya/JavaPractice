package Abstraction;

public class EX01 {
    public static void main(String[] args) {
        WagonR w1=new WagonR();
        w1.drive();
    }
}

class Car extends Engine{
    @Override
    public void startEngine() {
        System.out.println("start");
    }

    public void drive(){

        System.out.println("driving");
        stopEngine();
    }
}
class WagonR extends Engine{


    public void drive(){
        startEngine();
       System.out.println("driving");
       stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("start");
    }
}
abstract class Engine{
    abstract public void startEngine();

    public void stopEngine(){
        System.out.println("Stop");
    }
}