package abstractfactory;

final class TropicalProducts {

    static class TropicalSensor implements ClimateSensor {
        @Override
        public String readConditions() {
            return "31C / 85% humidity (tropical target: 26-32C, 70-90%)";
        }
    }

    static class TropicalController implements ClimateController {
        @Override
        public String applyCorrection(String sensorReading) {
            return "Deploying shade cloth to cool the canopy without drying the air";
        }
    }

    static class TropicalIrrigation implements IrrigationSystem {
        @Override
        public String irrigate() {
            return "Misting cycle: fine spray every 2 hours to hold humidity";
        }
    }
}
