package GOIT;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {

        String sourceWordLower = sourceWord.toLowerCase();
        String targetWordLover = targetWord.toLowerCase();

        char[] sourceArr = sourceWordLower.toCharArray();
        char[] targetArr = targetWordLover.toCharArray();

        boolean res = false;

        for (char source : sourceArr) {
            for (char target : targetArr) {
                if (target == source) {
                    res = true;
                    break;
                } else {
                    res = false;
                }
            }
        }
        return res;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}