package abstractfactory;

final class DesertProducts {

    static class DesertSensor implements ClimateSensor {
        @Override
        public String readConditions() {
            return "38C / 20% humidity (desert target: 30-42C, 10-30%)";
        }
    }

    static class DesertController implements ClimateController {
        @Override
        public String applyCorrection(String sensorReading) {
            return "Opening roof vents fully to dump heat; no misting";
        }
    }

    static class DesertIrrigation implements IrrigationSystem {
        @Override
        public String irrigate() {
            return "Deep-soak cycle: 5 minutes once every 3 days at the root zone";
        }
    }
}
