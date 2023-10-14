package GOIT;

public class LevelThree {

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

    }


    private LevelInfo levelInfo;
    private Point[] points;


    public LevelThree(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }



    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

//    У нашому випадку алгоритм хешування дуже простий.
//    Для кожної точки ми множимо координати x та y, і складаємо суму всіх цих множень. Отримане число і буде хеш.


    public int calculateLevelHash(){
        int pointHash = 0;
        for (Point point: points) {
            pointHash += point.getX() * point.getY();
        }
        return pointHash;
    }


}

class LevelTest {
    public static void main(String[] args) {
        LevelThree.Point p1 = new LevelThree.Point(3, 5);
        LevelThree.Point p2 = new LevelThree.Point(10, 100);
        LevelThree.Point p3 = new LevelThree.Point(50, 40);

        LevelThree.Point[] points = {p1, p2, p3};

        LevelThree.LevelInfo info = new LevelThree.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new LevelThree(info, points).calculateLevelHash());
    }
}
