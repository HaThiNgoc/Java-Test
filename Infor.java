package SchoolManagement;

public class Infor {
    String name;
    int age;
    String cccd;

    public Infor() {
    }

    public Infor(String name, int age, String cccd) {
        this.name = name;
        this.age = age;
        this.cccd = cccd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
}
