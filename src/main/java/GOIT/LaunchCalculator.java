package GOIT;

public class LaunchCalculator {

    public int calculateTotalPrice(OneSpaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("SomeTask.JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("SomeTask.MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SomeTask.SunHeaven price = " + sunHeavenPrice); //2000
    }

}

abstract class OneSpaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}


class JupiterStar extends OneSpaceport{

    @Override
    public int calculateTotalPrice(int passengerCount) {
        int fixPrice = 500;
        int ticket = 2;
        int total = fixPrice + (passengerCount * ticket);
        return total;
    }
}

class MercuryBeat extends OneSpaceport{

    @Override
    public int calculateTotalPrice(int passengerCount) {
        int ticket = 15;
        int total = passengerCount * ticket;
        return total;
    }
}

class SunHeaven extends OneSpaceport{

    @Override
    public int calculateTotalPrice(int passengerCount) {
        int ticket = 2000;
        return ticket;
    }
}









