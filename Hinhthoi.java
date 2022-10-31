import java.lang.Math;
public class Hinhthoi {
    double dcheo1, dcheo2;

    public Hinhthoi() {
    }

    public double Chuvi() {
        double canh = dcheo1 * dcheo1 + dcheo2 * dcheo2;
        return 2 * Math.sqrt((double) canh);
    }

    public double Dientich() {
        double S = dcheo1 * dcheo2 / 2;
        return S;
    }

}
