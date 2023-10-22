package GOIT;

public class GooQuery {

    private String language;
    private String text;

    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Searching [" + text + "], using language: " + language;
    }
}

//    Метод toString() об'єкта GooQuery{"fr", "homework"} повертає неправильне значення Searching homework, using language: fr, а мав повернути значення Searching [homework], using language: fr

class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");

        //en
        System.out.println(query.getLanguage());

        //capital
        System.out.println(query.getText());

        //Searching [capital], using language: en
        System.out.println(query);
    }
}