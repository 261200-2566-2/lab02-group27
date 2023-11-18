// instance variables
    // model,serialNo,mode,power,fanSpeed
// instance methods
    // turnOn no input, void
    // turnOff no input, void
    // setMode receive String, void
    // setFanSpeedByMode receive String, void
    // setFanSpeedByManual receive String, void
    // getPMLevel no input, return int
// class variables
    // machineCount,modelCount,listOfMode
// class methods
    // mostPopularModel no input, return String
public class AirPurifier {
    String model;
    String serialNo;
    String mode;
    boolean power;
    int fanSpeed;
    void turnOn() { power = true; fanSpeed = 3;}
    void turnOff() { power = false; fanSpeed = 0; mode = listOfMode[3]; }
    void setMode(String mode) {
        if(!power) {
            System.out.println("Unable to set mode. air purifier is turned off.");
            return;
        }
        for(int i=0; i<3; i++){
            if(mode.equals(listOfMode[i])){
                this.mode = mode;
                System.out.println("Mode set successfully.");
                setFanSpeedByMode(mode);
                return;
            }
        }
        System.out.println("mode undefined pls try again");
    }
    void setFanSpeedByMode(String mode) {
        if(mode.equals("sleep")) { this.fanSpeed = 1; }
        if(mode.equals("high speed")) { this.fanSpeed = 8; }
    }
    void setFanSpeedByManual(int fanSpeed) {
        if(!power) {
            System.out.println("Unable to set fan speed. air purifier is turned off.");
            return;
        }
        if(fanSpeed>0 && fanSpeed<=10){
            this.fanSpeed = fanSpeed;
            System.out.println("Fan speed set successfully.");
            this.mode = listOfMode[0];
        }else{
            System.out.println("speed undefined pls try again");
        }
    }
    int getPMLevel() {
        if(!power) {
            System.out.println("Unable to get PM2.5 level. air purifier is turned off.");
            return 0;
        }else{
            return 1;
        }
    }
    AirPurifier(String _model,
                String _serialNo) {
        model = _model; serialNo = _serialNo; machineCount++;
    }
    static int machineCount;
    static String[] listOfMode = {"manual","sleep","high speed","off"};
    //static String mostPopularModel() { ... }
}
