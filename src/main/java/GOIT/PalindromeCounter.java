package GOIT;

public class PalindromeCounter {

    public int count(String phrase) {
        int counter = 0;
        String[] strings = phrase.toLowerCase().split(" ");
        String[] stringsRevers = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            stringsRevers[i] = new StringBuilder(strings[i]).reverse().toString();
            if (strings[i].equals(stringsRevers[i])) {
                counter++;
            }
        }
        return counter;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}