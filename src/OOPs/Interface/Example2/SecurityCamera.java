package OOPs.Interface.Example2;

public class SecurityCamera implements Controllable, StatusReportable, MotionDetectable {
    //  Implement these interfaces:
    //- Controllable
    //- StatusReportable
    //- MotionDetectable
    //Requirements:
    //- Store whether the camera is on or off.
    //- detectMotion() reports motion detected when the camera is on.
    //- When it is off, report that motion detection is unavailable.
    //- getStatus() reports the camera's power state.

    private String name;
    private boolean isOn;

    public SecurityCamera(String name) {
        this.name = name;
        this.isOn = false;
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
    public void detectMotion() {
        if (isOn) {
            System.out.println("Motion detected by " + name + "!");
        } else {
            System.out.println(name + " is OFF. Motion detection unavailable.");
        }
    }

    @Override
    public void getStatus() {
        System.out.println(name + ": " + (isOn ? "ON" : "OFF"));
    }
}
