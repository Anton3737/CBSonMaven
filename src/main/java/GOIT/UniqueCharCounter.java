package GOIT;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharCounter {
    public int count(String phrase) {

        Set<Character> uniqueLetter = new HashSet<>();
        char[] chars = phrase.toLowerCase().toCharArray();
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isLetterOrDigit(chars[i]) || !Character.isWhitespace(chars[i])){
                uniqueLetter.add(chars[i]);
            }
        }
        // перевір на пробіл
        return uniqueLetter.size();
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));

        //8
        System.out.println(charCounter.count("Xo9fu P7"));
    }
}