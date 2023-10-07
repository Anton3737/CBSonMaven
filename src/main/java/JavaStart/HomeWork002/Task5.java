package JavaStart.HomeWork002;

public class Task5 {
    public static void main(String[] args) {

//        byte numbByte = 99999;

        int numbInt = 99999;


//        System.out.println(numb);
        System.err.println("java: incompatible types: possible lossy conversion from int to byte");
        System.out.println(" Вище вказана помилка при вказання значення 99999 для типу даних byte означає що тип даних byte не може містити в собі значення що перевищує його байтовий вміст \n " +
                "що має діапазон від -128 до + 127 , є необхідність у вказанні типу даних int з ємністю між -32768 до 32767 ");


        System.out.println(numbInt);


    }

}
