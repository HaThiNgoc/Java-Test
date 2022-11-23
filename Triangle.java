package Area_Peri;

public class Triangle extends Shape{
   float a,b,c;
   public Triangle(){}

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float tinhChuvi(){
       return a + b + c;
    }
    public float tinhDientich(){
        float p=tinhChuvi()/2;
        float s= (p*(p-a)*(p-b)*(p-c));
        return (float) Math.sqrt((float)s);
    }
}

