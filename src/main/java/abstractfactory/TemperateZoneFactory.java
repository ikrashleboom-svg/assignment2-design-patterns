package abstractfactory;

public class TemperateZoneFactory implements GreenhouseZoneFactory {

    @Override
    public ClimateSensor createSensor() {
        return new TemperateProducts.TemperateSensor();
    }

    @Override
    public ClimateController createController() {
        return new TemperateProducts.TemperateController();
    }

    @Override
    public IrrigationSystem createIrrigationSystem() {
        return new TemperateProducts.TemperateIrrigation();
    }
}
