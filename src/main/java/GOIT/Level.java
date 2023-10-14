package GOIT;

public class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelTooBigException extends Exception {

    LevelTooBigException levelTooBigException = new LevelTooBigException();
    String msg = "Level too big";

}

class LevelLoader extends LevelTooBigException{
    public void load(Level level) throws LevelTooBigException{
        try {
            int sqrt =  level.getHeight() * level.getWidth();
            if (sqrt > 100000){
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}