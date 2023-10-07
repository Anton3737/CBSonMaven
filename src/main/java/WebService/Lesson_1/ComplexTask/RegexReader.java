package WebService.Lesson_1.ComplexTask;

import java.io.BufferedReader;
import java.io.FileReader;

public class RegexReader {


    public String ReaderXMLMet(String xmlUrl) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(xmlUrl));
            StringBuilder stringBuilder = new StringBuilder();
            String dataXml;

            while ((dataXml = bufferedReader.readLine()) != null) {
                stringBuilder.append(dataXml).append("\n");
            }
            bufferedReader.close();

            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return "Неможу зчитати";
    }


    public String RegexStringCleanerMet(String inputDataForClean) {
        String cleanText = "";

        if (inputDataForClean.length() != 0) {
            cleanText = inputDataForClean.replaceAll("Orangery|Plant|Name|Soil|Origin|VisualParameters|StemColor|LeafColor|Size|GrowingTips|Temperature|Light|Watering|Multiplying", "")
                    .replaceAll("<|>|/|=|\"", "")
                    .replaceAll("", "");
            return cleanText.trim();
        }
        return "Я не можу очистити файл";
    }

}
