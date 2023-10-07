package WebService.Lesson_1.ComplexTask;

import WebService.Lesson_1.ComplexTask.entity.Orangery;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException, TransformerException {

        System.out.println("-------------------------------------------------------------------------------------");

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        SAXObjHendler saxObjHendler = new SAXObjHendler();

        System.out.println("Створюємо XML файл");

        // Парсим вихідний файл з ДОМ Хелпера
        File file = new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNewObjOut.xml");
        parser.parse(file, saxObjHendler);

        List<Orangery> plantsList = saxObjHendler.getPlantsList();

        System.out.println("Виводимо спарсений файл");

        System.out.println("All plants: ");
        System.out.println(plantsList.size() + " Обєктві");

        for (Orangery plant : plantsList) {
            System.out.println(
                    plant.getCode() + " " +
                            plant.getName() + " " +
                            plant.getSoil() + " " +
                            plant.getOrigin() + " " +
                            plant.getStemColor() + " " +
                            plant.getLeafColor() + " " +
                            plant.getSize() + " " +
                            plant.getTemperature() + " " +
                            plant.getLight() + " " +
                            plant.getWatering() + " " +
                            plant.getMultiplying());
        }


        System.out.println("-------------------------------------------------------------------------------------");

            System.out.println("Додаємо новий елемент ");


            DOMHelperForAddObj domHelperForAddObj = new DOMHelperForAddObj();


            Orangery orangery = new Orangery();


            orangery.setCode("18");
            orangery.setName("Гортензія");
            orangery.setSoil("Чорнозем");
            orangery.setOrigin("США");
            orangery.setStemColor("Зелена");
            orangery.setLeafColor("Рожева");
            orangery.setSize("Великий");
            orangery.setTemperature("25");
            orangery.setLight("Світлолюбива");
            orangery.setWatering("Раз рази на тиждень");
            orangery.setMultiplying("Пилове розмноження");

            domHelperForAddObj.addPlant(orangery);


        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Оновлюємо Веб сторінку");

        // трансформери
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNew.xslt")));
            StreamSource streamSource = new StreamSource(new File("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNewObjOut.xml"));
            StreamResult streamResult = new StreamResult(new File("src/WebService/Lesson_1/ComplexTask/OrangeryNewObj.html"));
            transformer.transform(streamSource, streamResult);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------------------------------------------------------------------");


        System.out.println("Зчитуємо XML файл як рядок для подальшого очищення");

        RegexReader regexReader = new RegexReader();
        regexReader.ReaderXMLMet("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNewObj.xml");

        System.out.println("-------------------------------------------------------------------------------------");


        System.out.println("Очищений через регулярні вирази XML файл:");

        System.out.println(regexReader.RegexStringCleanerMet(regexReader.ReaderXMLMet("/Users/macintosh/IdeaProjects/CBS/src/WebService/Lesson_1/ComplexTask/OrangeryNewObj.xml")));
    }
}
































