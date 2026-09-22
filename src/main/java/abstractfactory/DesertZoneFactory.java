package abstractfactory;

public class DesertZoneFactory implements GreenhouseZoneFactory {

    @Override
    public ClimateSensor createSensor() {
        return new DesertProducts.DesertSensor();
    }

    @Override
    public ClimateController createController() {
        return new DesertProducts.DesertController();
    }

    @Override
    public IrrigationSystem createIrrigationSystem() {
        return new DesertProducts.DesertIrrigation();
    }
}
