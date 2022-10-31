import java.lang.Math;
public class Tamgiac {
    double a,b,c;
    public Tamgiac(){}
    public double Chuvi(){return a+b+c;}
    public double Dientich(){
        double p=Chuvi()/2;
        double s= (p*(p-a)*(p-b)*(p-c));
        return  Math.sqrt((double)s); }
}
