package factorymethod;
public class WateringStation extends ControlStation {

    @Override
    protected Actuator createActuator() {
        return new WateringActuator();
    }

    @Override
    protected String stationName() {
        return "WateringStation";
    }
}
