package SchoolManagement;

import java.util.ArrayList;

public class Student extends Infor{
    String cls;
    public Student(){
    }
    public Student(String name, int age, String cccd, String cls) {
        super(name, age, cccd);
        this.cls = cls;
    }
    public void prinData(ArrayList<Student> students){
        students.forEach(e -> {
            System.out.println(e.getName()+" "+e.getAge()+ " "+ e.getCccd());
        });
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCccd() {
        return cccd;
    }
}
