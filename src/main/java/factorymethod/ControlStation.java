package factorymethod;

public abstract class ControlStation {
    protected abstract Actuator createActuator();
    protected abstract String stationName();
    public final void runCycle() {
        Actuator actuator = createActuator();
        String effect = actuator.activate();
        int watts = actuator.powerDrawWatts();
        System.out.printf("[%s] %s (power draw: %d W)%n", stationName(), effect, watts);
    }
}
