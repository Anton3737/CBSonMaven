package GOIT;

public class PunctuationMarkCounter {

    public int count(String phrase) {
        int lenghtPhrasee = phrase.length();
        char[] chars = phrase.toCharArray();
        int count = 0;

        for (int i = 0; i < lenghtPhrasee; i++) {
            String tmpChar = String.valueOf(chars[i]);
            if (tmpChar.equals(".") || tmpChar.equals(",") || tmpChar.equals("!") || tmpChar.equals(":") || tmpChar.equals(";")) {
                count++;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}