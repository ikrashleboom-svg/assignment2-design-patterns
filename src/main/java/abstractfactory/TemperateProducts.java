package abstractfactory;

final class TemperateProducts {

    static class TemperateSensor implements ClimateSensor {
        @Override
        public String readConditions() {
            return "22C / 55% humidity (temperate target: 18-24C, 45-65%)";
        }
    }

    static class TemperateController implements ClimateController {
        @Override
        public String applyCorrection(String sensorReading) {
            return "Cracking vents halfway to nudge humidity down slightly";
        }
    }

    static class TemperateIrrigation implements IrrigationSystem {
        @Override
        public String irrigate() {
            return "Standard drip cycle: 10 minutes once a day";
        }
    }
}
