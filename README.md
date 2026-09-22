# Assignment 2 — Factory Method & Abstract Factory

Theme: smart greenhouse 

## What I did

Split it into Part A (Factory Method) and Part B (Abstract Factory) like the assignment asked. Went with a greenhouse because it makes the difference between the two patterns pretty obvious — Part A just builds one device, Part B builds a whole set of devices that have to match each other.

## How to run

```bash
javac -d out $(find src -name "*.java")
java -cp out Main
```

## Part A — Factory Method

I've got "actuators" for the greenhouse: watering, ventilation, and lighting. They all implement one `Actuator` interface with `activate()` (what it did) and `powerDrawWatts()` (how much power it used).

Then there's an abstract `ControlStation` class with `createActuator()` — that's the factory method — and `runCycle()`, which actually uses whatever gets created (logs what happened, doesn't just create and forget). `WateringStation`, `VentilationStation`, `LightingStation` extend it and each override `createActuator()` to return their own device.

In the client code I never call `new WateringActuator()` directly, only through the stations. That's basically the whole point — the client doesn't need to know which exact product it's getting.

## Part B — Abstract Factory

Here it's not one product but a set of three that all need to match: `ClimateSensor`, `ClimateController`, `IrrigationSystem`. They have to belong to the same climate zone — a tropical setup shouldn't end up with a desert irrigation system by accident.

`GreenhouseZoneFactory` is the abstract factory with one create-method per product. Three concrete factories cover the three zones: `TropicalZoneFactory`, `DesertZoneFactory`, `TemperateZoneFactory`.

The client (`GreenhouseZoneController`) gets a factory passed into its constructor and only ever talks to the interfaces — it has no idea which zone it's running. The zone only gets picked once, in `AbstractFactoryDemo`, nowhere else.

## Why this is Abstract Factory and not just three Factory Methods

If I'd made three separate factory methods (one for sensors, one for controllers, one for irrigation), nothing would stop someone from mixing a tropical sensor with a desert irrigation system by mistake. Abstract Factory prevents that since one factory always gives you the whole matching set.

## SOLID connection

Adding a new device or a new zone just means adding new classes, nothing existing gets touched (open/closed). Also each class does one job — an actuator just acts, a station just picks which actuator to build, a zone factory just builds one matching set.

## Downside

If the greenhouse only ever needed one device type and one zone, all these interfaces would just be overkill — a couple of if/else statements would do the job. It only pays off because the number of device types and zones is expected to grow.

## Weak spot of Abstract Factory

If I add a new type of product to the family (say a pest-control unit that also needs to be zone-specific), I'd have to go update every existing factory — tropical, desert, temperate — to add that new create method. So adding a new zone is easy, but adding a new product type across all zones is a pain.
