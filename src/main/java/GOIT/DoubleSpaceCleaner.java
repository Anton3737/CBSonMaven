package GOIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleSpaceCleaner {

    public String clean(String phrase) {
        String reg = "\\s+";
        return phrase.replaceAll(reg," ").trim();
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}