package GOIT;

import java.util.Arrays;

public class DigitExtracter {
    public int[] extract(String text){
        String reg = "[a-z]|[A-Z]|\\D";
        String tmp = text.replaceAll(reg,"");
        int [] arr = new int[tmp.length()];
        char[] chars = tmp.toCharArray();
        for (int i = 0; i < tmp.length(); i++) {
            arr[i] = Character.getNumericValue(chars[i]);
        }
        return arr;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
