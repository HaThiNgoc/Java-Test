import java.util.ArrayList;
import java.lang.String;
public class main5 {
    public static void main(String[] args){
        ArrayList<ID> lst_id = new ArrayList<>();
        lst_id.add(new ID("1122"));
        lst_id.add(new ID("3322"));
        ArrayList<Brand> lst_brand= new ArrayList<>();
        lst_brand.add(new Brand("MSI"));
        lst_brand.add(new Brand("Intel"));
        ArrayList<CPU> lst_cpu = new ArrayList<>();
        lst_cpu.add( new CPU("Intel Core 19 10900k", lst_id.get(0), lst_brand.get(0),30000F));
        lst_cpu.add( new CPU("AMD 9 3000x", lst_id.get(1), lst_brand.get(1),30000F));
        ArrayList<Mainboard> lst_main = new ArrayList<>();
        lst_main.add( new Mainboard("X123", lst_id.get(0), lst_brand.get(0),30000F));
        lst_main.add( new Mainboard("X456", lst_id.get(1), lst_brand.get(1),30000F));
        ArrayList<JAM> lst_ram = new ArrayList<>();
        lst_ram.add( new JAM("Intel Core 19 10900k", lst_id.get(0), lst_brand.get(0),30000F));
        lst_ram.add( new JAM("AMD 9 3000x", lst_id.get(1), lst_brand.get(1),30000F));
        ArrayList<Computer> lst_pc= new ArrayList<>();
        lst_pc.add(new Computer(lst_cpu.get(0), lst_ram.get(0),lst_main.get(0), lst_brand.get(0)));
        lst_pc.add(new Computer(lst_cpu.get(1), lst_ram.get(1),lst_main.get(1), lst_brand.get(1)));

        lst_pc.forEach( computer -> {
            System.out.printf("%s %s %s %f", computer.getCpu().getName(), computer.getRam().getName(),
                    computer.getMainboard().getName(), computer.getPrice());
        } );

    }
}
