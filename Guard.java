package SchoolManagement;

import java.util.ArrayList;

public class Guard extends Infor {
    public Guard(){}
    public Guard(String name, int age, String cccd) {
        super(name, age, cccd);
    }
    public void prinData(ArrayList<Guard> guards){
        guards.forEach(e -> {
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
