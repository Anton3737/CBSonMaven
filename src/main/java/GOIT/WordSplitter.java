package GOIT;

import java.util.Arrays;
import java.util.Locale;

public class WordSplitter {

    public String[] split(String phrase){
        String [] array = phrase.toLowerCase().split("\\s+");
        return array;
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");


        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}