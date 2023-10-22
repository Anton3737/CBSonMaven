package GOIT;

public class BigOrSmall {
    public String calculate(String text) {
        int upCounter = 0;
        int dwCounter = 0;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals(String.valueOf(chars[i]).toLowerCase())) {
                dwCounter++;
            }if (String.valueOf(chars[i]).equals(String.valueOf(chars[i]).toUpperCase())) {
                upCounter++;
            }
        }
        if (upCounter > dwCounter) {
            return "Big";
        }
        if (upCounter < dwCounter) {
            return "Small";
        }
         else
            return "Same";
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}