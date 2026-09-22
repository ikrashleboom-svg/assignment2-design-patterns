package abstractfactory;

public class AbstractFactoryDemo {

    public static void run() {
        System.out.println("=== Part B: Abstract Factory ===");

        GreenhouseZoneFactory[] zones = {
                new TropicalZoneFactory(),
                new DesertZoneFactory(),
                new TemperateZoneFactory()
        };

        for (GreenhouseZoneFactory zone : zones) {
            System.out.println(zone.getClass().getSimpleName() + ":");
            GreenhouseZoneController zoneController = new GreenhouseZoneController(zone);
            zoneController.monitorAndControl();
        }
    }
}
