//@author Aidan Weller
import RandomNumbers.NumberGenerator;
public class Safety {
    EmergencyBrakes EBrake = new EmergencyBrakes();
    int totalWeightInElevator;
    int maxWeight;
    public Safety(int totalWeightInElevator,int maxWeight) {
        this.totalWeightInElevator = totalWeightInElevator;
        this.maxWeight = maxWeight; //Weight System is working, to show it set this.maxWeight = 1;
    }
    //Weight Stuff dude, this was a total fucking bitch to do. Several hours of debugging.
    public void WeightCheckElevator(){
        safetyCheck(totalWeightInElevator,maxWeight);
    }

    public void safetyCheck(int totalWeightInElevator,int maxWeight){
        System.err.println("Safety.Java: Total Weight: " + totalWeightInElevator + " Maximum Weight: " + maxWeight);

        if(totalWeightInElevator<maxWeight){
            System.out.println("Weight Okay!");
        }else
        if(totalWeightInElevator>maxWeight){
            System.err.println("HOLY FUCK IT'S TOO HEAVY");
            EBrake.HOLYFUCKSTOP();
        }
    }

    public boolean rollDisaster() {
       boolean disasterStatus = false;
       int result = NumberGenerator.genRandomDisaster();
       if(result<2){
           disasterStatus = true;
           return disasterStatus;
       }else
        return disasterStatus;
    }
}
