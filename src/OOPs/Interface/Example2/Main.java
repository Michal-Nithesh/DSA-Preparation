package OOPs.Interface.Example2;

public class Main {
    //  Create at least:
    //- Two smart lights.
    //- One smart fan.
    //- One security camera.
    //Perform these operations:
    //1. Turn on all devices.
    //2. Set the first light's brightness to 75.
    //3. Set the fan speed to 3.
    //4. Detect motion using the camera.
    //5. Print the status of every device.
    //6. Turn off all devices.
    //7. Print their statuses again.
    public static void main(String[] args) {

        SmartLight light1 = new SmartLight("Living Room Light");
        SmartLight light2 = new SmartLight("Bedroom Light");

        SmartFan fan = new SmartFan("Ceiling Fan");

        SecurityCamera camera = new SecurityCamera("Front Door Camera");

        SmartHome home = new SmartHome();

        home.addDevice(light1);
        home.addDevice(light2);
        home.addDevice(fan);
        home.addDevice(camera);

        System.out.println("===== SMART HOME SYSTEM =====");

        home.turnOnAll();

        System.out.println("\n===== ADJUSTING DEVICES =====");

        light1.setBrightness(75);
        fan.setSpeed(3);

        System.out.println("\n===== MOTION DETECTION =====");

        camera.detectMotion();

        System.out.println("\n===== DEVICE STATUS =====");

        home.displayAllStatus();

        home.turnOffAll();

        System.out.println("\n===== FINAL DEVICE STATUS =====");

        home.displayAllStatus();
    }
}
