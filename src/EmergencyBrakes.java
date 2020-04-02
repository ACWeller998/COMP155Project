//@author Aidan Weller
public class EmergencyBrakes {
    boolean brakeStatus = false; //Emergency brakes off by default

    public void HOLYFUCKSTOP(){
        System.err.println("TOO HEAVY, EMERGENCY BRAKES ON");
        brakeStatus = true;
    }
}
