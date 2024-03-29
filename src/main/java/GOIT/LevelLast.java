package GOIT;

public class LevelLast {
    private int width;
    private int height;

    public LevelLast(int width, int height) {
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


class LevelTooBigException extends Exception{
        public LevelTooBigException(){
        }

}

class LevelLoader {

    public void load(LevelLast level) throws LevelTooBigException{

        int sqrt = (level.getHeight() * level.getWidth());
        if (sqrt < 100000){
            System.out.println("Level loaded");
        }else {
            throw new LevelTooBigException();
        }

    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new LevelLast(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new LevelLast(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}