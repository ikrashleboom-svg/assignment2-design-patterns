package factorymethod;
public class VentilationStation extends ControlStation {

    @Override
    protected Actuator createActuator() {
        return new VentilationActuator();
    }

    @Override
    protected String stationName() {
        return "VentilationStation";
    }
}
