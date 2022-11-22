import java.sql.SQLOutput;
import java.util.Scanner;

public class Mainboard {
    private  String name;
    private ID id;
    private Brand brand;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Mainboard(String name, ID id, Brand brand, float price) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.price = price;
    }


}