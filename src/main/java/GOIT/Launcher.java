package GOIT;

public class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();

    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();

    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();

    private CommandPost commandPost = new CommandPost();

    public GasStation getGasStation() {
        return gasStation;
    }

    public void setGasStation(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    public void launch() {
      gasStation.refuel();
      serviceTower.service();
      compressorStation.compress();
      radar.scan();
      commandPost.command();
    }

    public void gasStation() {

    }

    public void refuel() {
        System.out.println(gasStation);
    }

}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower{
    public void service(){
        System.out.println("Service done!");
    }
}

class CompressorStation{
    public void compress(){
        System.out.println("Compress done!");
    }
}

class Radar{
    public void scan(){
        System.out.println("Scan done!");
    }

}

class CommandPost{
    public void command(){
        System.out.println("Fire!");
    }
}