package WebService.Lesson4.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NBUParsHelper {


    public static String performRequest(String urlInput) throws IOException {

        URL url = new URL(urlInput);
        StringBuilder stringBuilder = new StringBuilder();

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            char[] buferedReaderCharArray = new char[1000000];
            int counter = 0;

            do {
                if ((counter = br.read(buferedReaderCharArray)) > 0) {
                    stringBuilder.append(new String(buferedReaderCharArray, 0, counter));
                }
            } while (counter > 0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            httpURLConnection.disconnect();
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }


    public void inputToParsMet(String url) {


    }

    public static void main(String[] args) throws IOException {
        NBUParsHelper nbuParsHelper = new NBUParsHelper();
        nbuParsHelper.performRequest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");


    }

}













