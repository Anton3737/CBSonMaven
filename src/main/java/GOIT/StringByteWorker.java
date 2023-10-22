package GOIT;

import java.io.UnsupportedEncodingException;

public class StringByteWorker {

    public String process(byte[] bytes) {
        try {
            String uncode = "UTF-8";
            String charArray = new String(bytes, uncode);
            return charArray.toLowerCase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}