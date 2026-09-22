package abstractfactory;

public interface GreenhouseZoneFactory {
    ClimateSensor createSensor();
    ClimateController createController();
    IrrigationSystem createIrrigationSystem();
}
