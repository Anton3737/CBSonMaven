package GOIT;

public class LevelOne1 {

    private String name;

    public LevelOne1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quarke Level, name is " +  name;
    }
}

class LevelTestOne {
    public static void main(String[] args) {
        //Quarke Level, name is Test
        System.out.println(new LevelOne1("Test"));
        System.out.println(new LevelOne1("Христина"));
        System.out.println(new LevelOne1("Антон"));
    }
}