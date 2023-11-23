import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {

        System.out.println("Order 1 air purifier model: xiaomao seial number: K78.");
        AirPurifier a = new AirPurifier("xiaomao","K78");
        System.out.println("Try to set mode to sleep while power is off.");
        a.setMode("sleep");
        System.out.println("Try to set fan speed while power is off.");
        a.setFanSpeedByManual(2);
        System.out.println("turn air purifier on");
        a.turnOn();
        System.out.println("Try to set mode to sleep.");
        a.setMode("sleep");
        System.out.println("Current mode is " + a.mode);
        System.out.println("Current fan speed is " + a.fanSpeed);
        System.out.println("Try to set mode to high speed.");
        a.setMode("high speed");
        System.out.println("Current mode is " + a.mode);
        System.out.println("Current fan speed is " + a.fanSpeed);
        System.out.println("Try to set fan speed to 10.");
        a.setFanSpeedByManual(10);
        System.out.println("Current mode is " + a.mode);
        System.out.println("Current fan speed is " + a.fanSpeed);
        System.out.println("Try to set fan speed to 100000.");
        a.setFanSpeedByManual(100000);
        System.out.println("Try to get PM level.");
        System.out.println("PM level is " + a.getPMLevel());
        System.out.println("turn air purifier off");
        a.turnOff();
        System.out.println("Current mode is " + a.mode);
        System.out.println("Current fan speed is " + a.fanSpeed);
        System.out.println("List of mode: " + Arrays.toString(AirPurifier.listOfMode));
        System.out.println("Order 2 air purifiers");
        AirPurifier b = new AirPurifier("xiaopao","K79");
        AirPurifier c = new AirPurifier("elonmao","K80");
        System.out.println("machine count: " + AirPurifier.machineCount);
    }
}
