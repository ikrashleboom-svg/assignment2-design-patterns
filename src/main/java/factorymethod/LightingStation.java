package factorymethod;
public class LightingStation extends ControlStation {

    @Override
    protected Actuator createActuator() {
        return new LightingActuator();
    }

    @Override
    protected String stationName() {
        return "LightingStation";
    }
}
