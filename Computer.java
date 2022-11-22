public class Computer {
    private CPU cpu;
    private JAM ram;
    private Mainboard mainboard;
    private Brand brand;
    public float price;


    public Computer(CPU cpu, JAM ram, Mainboard mainboard, Brand brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.mainboard = mainboard;
        this.brand = brand;
        this.price = cpu.getPrice() + ram.getPrice() +mainboard.getPrice();
    }

    public CPU getCpu() {
        return cpu;
    }

    public JAM getRam() {
        return ram;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public Brand getBrand() {
        return brand;
    }
    public float getPrice() {
        return price;
    }


}
