package OOPs.Interface.Example2;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    //  This class manages all devices.
    //Requirements:
    //- Store devices in an ArrayList.
    //- Add lights, fans, and cameras to the list.
    //- Turn all devices on or off using a loop.
    //- Display all device statuses using a loop.
    //- Use interface references rather than relying on concrete classes wherever possible.
    //Challenge: Decide which interface or common abstraction your ArrayList should use so it can hold all three types of devices.
    private List<Controllable> devices = new ArrayList<>();

    public void addDevice(Controllable device) {
        devices.add(device);
    }

    public void turnOnAll() {
        System.out.println("\nTurning ON all devices...");

        for (Controllable device : devices) {
            device.turnOn();
        }
    }

    public void turnOffAll() {
        System.out.println("\nTurning OFF all devices...");

        for (Controllable device : devices) {
            device.turnOff();
        }
    }

    public void displayAllStatus() {
        for (Controllable device : devices) {
            if (device instanceof StatusReportable) {
                ((StatusReportable) device).getStatus();
            }
        }
    }
}
