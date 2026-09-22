package factorymethod;
public class VentilationActuator implements Actuator {

    @Override
    public String activate() {
        return "Extractor fan running at 70% speed: air exchanged, humidity dropping.";
    }

    @Override
    public int powerDrawWatts() {
        return 45;
    }
}
