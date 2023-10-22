package GOIT;

import JavaStart.HomeWork009.Arrays;

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] strings = phrase.toLowerCase().split(" ");
        float cout = 0;
        float stringsLength = strings.length;
        for (int i = 0; i < stringsLength; i++) {
            if (strings[i].equals(word.toLowerCase())) {
                cout++;
            }
        }
        float res = (cout / stringsLength);
        return res;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();
//        freqCounter.countFreq("Hello Java");


        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
//        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}