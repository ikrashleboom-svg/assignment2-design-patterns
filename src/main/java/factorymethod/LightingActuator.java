package factorymethod;
public class LightingActuator implements Actuator {

    @Override
    public String activate() {
        return "Grow lights switched on at full-spectrum, 18000 lux.";
    }

    @Override
    public int powerDrawWatts() {
        return 120; }
}
