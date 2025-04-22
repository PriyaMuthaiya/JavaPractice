package Collections;

public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;

    }
    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
