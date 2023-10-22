package GOIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathDetector {
    public boolean isMath(String text){
        Pattern digitRegex = Pattern.compile(".*[0-9]+[+\\-*/]+[0-9]+.*");
        Matcher matcher = digitRegex.matcher(text);
        return matcher.matches();
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}