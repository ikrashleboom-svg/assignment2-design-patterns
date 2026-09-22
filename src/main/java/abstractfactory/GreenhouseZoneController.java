package abstractfactory;

public class GreenhouseZoneController {

    private final ClimateSensor sensor;
    private final ClimateController controller;
    private final IrrigationSystem irrigationSystem;

    public GreenhouseZoneController(GreenhouseZoneFactory factory) {
        this.sensor = factory.createSensor();
        this.controller = factory.createController();
        this.irrigationSystem = factory.createIrrigationSystem();
    }

    public void monitorAndControl() {
        String reading = sensor.readConditions();
        System.out.println("  Sensor:      " + reading);
        System.out.println("  Controller:  " + controller.applyCorrection(reading));
        System.out.println("  Irrigation:  " + irrigationSystem.irrigate());
    }
}
