package Collections;

import java.util.ArrayList;
import java.util.List;

public class StoreStudentIntoArraylist {
    public static void main(String[] args) {
        Student s1=new Student("priya",27);
        Student s2=new Student("def",25);
        Student s3=new Student("kea",77);

        List<Student> StudentList=new ArrayList<Student>();
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);

        s1.printDetails();
        System.out.println(StudentList);

        for (Object each:StudentList){
            System.out.println(each);
        }

    }
}
