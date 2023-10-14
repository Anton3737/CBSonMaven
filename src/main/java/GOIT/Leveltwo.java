package GOIT;

class Leveltwo {

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    private String levelName;

    private Point[] points;

    public Leveltwo(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke Level, name is " + levelName + ", point count is " + points.length;
    }
}

class LevelTestTwo {
    public static void main(String[] args) {
        Leveltwo.Point p1 = new Leveltwo.Point(3, 5);
        Leveltwo.Point p2 = new Leveltwo.Point(10, 100);
        Leveltwo.Point p3 = new Leveltwo.Point(50, 40);

        Leveltwo.Point[] points = {p1, p2, p3};

        //Quarke Level, name is Test, point count is 3
        System.out.println(new Leveltwo("Test", points));
    }
}
