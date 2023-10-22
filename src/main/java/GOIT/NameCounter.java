package GOIT;

public class NameCounter {
    public int count(String text) {
        String[] strings = text.split(" ");
        int count = 0;

        for (String resArr : strings) {
            if (Character.isUpperCase(resArr.charAt(0)) && Character.isLowerCase(resArr.charAt(1))) {
                count++;
            }
        }
        return count;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}



