package GOIT;

public class WordDeleter {

    public String remove(String phrase, String[] words) {

        String[] phrasesArray = phrase.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String str : phrasesArray) {
            boolean delWord = false;
            for (String wordsArr : words) {
                if (str.equals(wordsArr)) {
                    delWord = true;
                    break;
                }
            }
            if (!delWord) {
                stringBuilder.append(str + " ");
            }
        }
            return stringBuilder.toString().trim();
        }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
