package Area_Peri;

public class Retangle extends Shape {
    float width, height;
    public Retangle(){
    }

    public Retangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float tinhChuvi(){
        return(width + height)*2;
    }
    public float tinhDientich(){
        return width * height;
    }
}
