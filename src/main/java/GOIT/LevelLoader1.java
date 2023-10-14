package GOIT;

public class LevelLoader1 {

    private static LevelLoader1 instance = new LevelLoader1();

    private LevelLoader1() {
    }

    public static LevelLoader1 getInstance(){
        return instance;
    }


    public static String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

}

class LevelLoaderTest1 {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader1.getInstance().load("StartLevel"));

        System.out.println(LevelLoader1.getInstance().load("StartLevel"));
        System.out.println(LevelLoader1.getInstance() == LevelLoader1.getInstance());

    }
}
