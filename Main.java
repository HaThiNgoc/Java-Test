import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Hcn hcn = new Hcn();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài hình chữ nhật : ");
        hcn.dai =scanner.nextDouble();
        System.out.println("nhập vào chiều rộng hình chữ nhật : ");
        hcn.rong=scanner.nextDouble();
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());

        Tamgiac tamgiac= new Tamgiac();
        System.out.println("Nhap do dai 3 canh tam giac: ");
        tamgiac.a= scanner.nextDouble();
        tamgiac.b= scanner.nextDouble();
        tamgiac.c= scanner.nextDouble();
        if(tamgiac.a+tamgiac.b<= tamgiac.c || tamgiac.a+tamgiac.c<=tamgiac.b || tamgiac.b+tamgiac.c<=tamgiac.a) System.out.println("Khong la tam giac");
        else {
            System.out.println("chu vi hinh tam giac: " + tamgiac.Chuvi());
            System.out.println("dien tich hinh tam giac: " + tamgiac.Dientich());
        }

        Hinhthoi hinhthoi = new Hinhthoi();
        System.out.println("Duong cheo hinh thoi lan luot la: ");
        hinhthoi.dcheo1 = scanner.nextDouble();
        hinhthoi.dcheo2 = scanner.nextDouble();
        System.out.println("chu vi hinh thoi: " + hinhthoi.Chuvi());
        System.out.println("Dien tich hinh thoi: " + hinhthoi.Dientich());

    }
}