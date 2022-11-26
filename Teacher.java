package SchoolManagement;

import java.util.ArrayList;

public class Teacher extends Infor {
    String sub;

    public Teacher() {
    }

    public Teacher(String name, int age, String cccd, String sub) {
        super(name, age, cccd);
        this.sub = sub;
    }

    public void prinData(ArrayList<Teacher> teachers) {
        teachers.forEach(e -> {
            System.out.println(e.getName() + " " + e.getAge() + " " + e.getCccd());
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

