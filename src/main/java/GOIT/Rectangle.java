package GOIT;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect){

        // ( зовнішня сторона  А >= поточну сторону А && зовнішня сторона  B >= поточну сторону B ) або ( зовнішня сторона  А >= поточну сторону B && зовнішня сторона  B >= поточну сторону A )
        return (anotherRect.getA() >= this.a && anotherRect.getB() >= this.b) || (anotherRect.getA() >= this.b && anotherRect.getB() >= this.a);
    }
}



class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);   // r1 = внутрішній   r2 = зовнішній
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}