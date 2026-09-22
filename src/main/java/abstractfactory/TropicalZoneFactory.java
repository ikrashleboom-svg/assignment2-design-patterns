package abstractfactory;

public class TropicalZoneFactory implements GreenhouseZoneFactory {

    @Override
    public ClimateSensor createSensor() {
        return new TropicalProducts.TropicalSensor();
    }

    @Override
    public ClimateController createController() {
        return new TropicalProducts.TropicalController();
    }

    @Override
    public IrrigationSystem createIrrigationSystem() {
        return new TropicalProducts.TropicalIrrigation();
    }
}
