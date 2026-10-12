package OOPs.Interface.Example2;

class SmartLight implements Controllable, StatusReportable, BrightnessAdjustable {
    //  Implement these interfaces:
    //- Controllable
    //- StatusReportable
    //- BrightnessAdjustable
    //Requirements:
    //- Store whether the light is on or off.
    //- Store brightness from 0 to 100.
    //- turnOn() switches the light on.
    //- turnOff() switches the light off.
    //- setBrightness() accepts values only from 0 to 100.
    //- getStatus() reports power and brightness.

    private String name;
    private boolean isOn;
    private int brightness;

    public SmartLight(String name) {
        this.name = name;
        this.isOn = false;
        this.brightness = 50;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }

    @Override
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println(
                    name + " brightness set to " + brightness + "%"
            );
        } else {
            System.out.println("Invalid brightness! Use 0-100.");
        }
    }

    @Override
    public void getStatus() {
        System.out.println(
                name + ": " + (isOn ? "ON" : "OFF")
                        + ", Brightness: " + brightness + "%"
        );
    }
}