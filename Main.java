import Area_Peri.Retangle;
import Area_Peri.Square;
import Area_Peri.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Retangle retangle = new Retangle(5,7);
       Square square = new Square(6);
        Triangle triangle = new Triangle(5,6,7);
        System.out.println("Chu vi, dien tich hcn:" + retangle.tinhChuvi()+ " "+ retangle.tinhDientich() );
        System.out.println("Chu vi, dien tich hv: " + square.tinhDientich() + " " + square.tinhDientich());
        System.out.println(("Chu vi, dien tich htg: " + triangle.tinhChuvi() + " " + triangle.tinhDientich()));
    }
}
