package GOIT;

public class RectangleArea {

    private int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int[] getCoords() {
        return coords;
    }

    public void setCoords(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
        double sqrt;
        double width = coords[2] - coords[0];
        double height = coords[3] - coords[1];
        sqrt = width * height;
        if (sqrt < 0) {
            return (int) Math.abs(sqrt);
        }
        return (int) sqrt;
    }

}


class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}