package OOPs.Interface.Example2;

public class SmartFan implements Controllable, StatusReportable, SpeedAdjustable {
    //  Implement these interfaces:
    //- Controllable
    //- StatusReportable
    //- SpeedAdjustable
    //Requirements:
    //- Store power state and fan speed.
    //- Allow speeds from 0 to 5.
    //- Reject invalid speeds.
    //- getStatus() reports power and speed.

    private String name;
    private boolean isOn;
    private int speed;

    public SmartFan(String name){
        this.name = name;
        this.isOn = false;
        this.speed = 0;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + "is OFF");
    }

    @Override
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 5) {
            this.speed = speed;
            System.out.println(name + " speed set to " + speed);
        } else {
            System.out.println("Invalid speed! Use 0-5.");
        }
    }

    @Override
    public void getStatus() {
        System.out.println(name + ": " + (isOn ? "ON" : "OFF") + ", Speed: " + speed);
    }
}
