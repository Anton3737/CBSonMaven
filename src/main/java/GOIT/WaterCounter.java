package GOIT;

public class WaterCounter {
    public double count(String text){
        char [] chars = text.toCharArray();
        int symbols = 0;
        int empty = 0;
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals(" ")){
                empty++;
            }
            symbols++;
        }
        System.out.println(symbols);
        System.out.println(empty);
        return (double) empty / symbols;
    }

}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}