package ClassAndObjects;


public class CarClass {
    String name;
    int year;
    String Model;

    //default co structor sets default value
    CarClass(){
        name="unknown";
        year=2018;
        Model="xxx";
    }

// parameterised constructor set value while object creation
    CarClass(String nameOfCar,int year,String ModelOfCar){
        this.name=nameOfCar;
        this.year=year;
        this.Model=ModelOfCar;


    }



}
