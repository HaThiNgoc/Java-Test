package Area_Peri;

public class Square {
    float canh;
    public Square(){
    }
    public Square(float canh) {
        this.canh = canh;
    }
    public float tinhChuvi(){
        return canh * 4;
    }
    public float tinhDientich(){
        return canh * canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

}
