package GOIT;

import java.util.regex.Matcher;

public class DigitText {
    public boolean detect(String text) {
        String reg = "[0-9]";
        String res = text.trim().replaceAll(reg, "").trim();

        if (res.isEmpty()) {
            return true;
        } else
            return false;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}