package JavaEssential.Leason4.Task5New;

public class FarinhateToKelvin implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double K = (value - 32) * 5 / 9 + 273.15;
        System.out.println("Згідно формули Tk = (Tf – 32) * 5 / 9 + 273.15  конвертація з °F на °K становить: " + K);
    }
}
