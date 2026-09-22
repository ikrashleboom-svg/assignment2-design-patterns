package factorymethod;

import java.util.List;

/**
 * Client. Notice it only ever talks to {@link ControlStation} and
 * {@link Actuator} -- it never writes "new WateringActuator()" or
 * any other "new ConcreteProduct()". Adding a new station type only
 * means adding one more entry to the list below; nothing else in
 * this class changes.
 */
public class FactoryMethodDemo {

    public static void run() {
        System.out.println("=== Part A: Factory Method ===");

        List<ControlStation> stations = List.of(
                new WateringStation(),
                new VentilationStation(),
                new LightingStation()
        );

        for (ControlStation station : stations) {
            station.runCycle();
        }
    }
}
