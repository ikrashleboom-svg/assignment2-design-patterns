package factorymethod;
public class WateringActuator implements Actuator {

    @Override
    public String activate() {
        return "Drip valve opened: 250 ml of water released to the root zone.";
    }

    @Override
    public int powerDrawWatts() {
        return 15;
    }
}
