package HomeWork6_3_2020;

public class InforBox {
    float Length;
    float Width;
    float Hight;

    public float getLength() {
        return Length;
    }

    public void setLength(float length) {
        Length = length;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float width) {
        Width = width;
    }

    public float getHight() {
        return Hight;
    }

    public void setHight(float hight) {
        Hight = hight;
    }

    public float Area(){
        return 2*(Length*Width) + 2*(Length+Width)*Hight;
    }

    public float Volume(){
        return Length*Width*Hight;
    }

    public String toString(){
        return "Box infor: \nLength: " + Length +"\nWidth: " + Width + "\nHight: " + Hight;
    }
}
