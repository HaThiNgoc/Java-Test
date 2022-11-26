package SchoolManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<Guard> lsg = new ArrayList<>();
        lsg.add( new Guard("A", 40, "GA78"));
        lsg.add( new Guard("B",60,"GB90"));
        ArrayList<Student> lss = new ArrayList<>();
        lss.add(new Student("Minh", 20, "S34","MIS63A"));
        lss.add(new Student("Hà", 22, "S37", "IT62B"));
        ArrayList<Teacher> lst = new ArrayList<>();
        lst.add(new Teacher("Ha Minh Nga", 39, "T793", "Math"));
        lst.add(new Teacher("Hoang Hoa", 45, "T402", "Physics"));
        System.out.println("Choose your list: ");
        System.out.println("1.Guard");
        System.out.println("2.Student");
        System.out.println("Your choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                Guard guard = new Guard();
                guard.prinData(lsg);
            case 2:
                Student student = new Student();
                student.prinData(lss);

            case 3:
                Teacher teacher = new Teacher();
                teacher.prinData(lst);
        }
    }
}
