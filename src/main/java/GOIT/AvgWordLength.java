package GOIT;

public class AvgWordLength {
    public double count(String phrase) {
        String[] strings = phrase.split(" ");
        double avg = 0.0;
        for (int i = 0; i < strings.length; i++) {
            avg += strings[i].length();
        }
        return avg / strings.length;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}