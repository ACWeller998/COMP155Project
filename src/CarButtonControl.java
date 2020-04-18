//author poorvi and  jasnoor

public class CarButtonControl {

    boolean destFloorLight=false;//Not Set
    boolean alarmLight=false;
    boolean emergencyLight=false;
    boolean doorOpenLight=false, doorCloseLight=false;
    boolean liftMovement=false;//Stopped

    CarButton carButton=new CarButton();
    int destinationFloor=carButton.getDestinationFloor();

    public void setLights()
    {
        if(carButton.getDestinationFloor()!=carButton.getCurrentFloor()) {
            destFloorLight = true;
            System.out.println("You just pressed " + carButton.getDestinationFloor() + " floor");
        }
        if(carButton.getAlarm()) {
            alarmLight = true;
            System.out.println("Alarm button pressed!");
        }
        if(carButton.getEmergencyButton()||carButton.getOpenButton()) {
            emergencyLight=true;
            doorOpenLight=true;
            System.out.println("Emergency button pressed!, Door opening");
        }
        if(carButton.getCloseButton()&&!carButton.getEmergencyButton()) {
            doorCloseLight=true;
            System.out.println("Door Closing");
        }


    }

    public int setLiftMovement()
    {
        if(carButton.getDestinationFloor()>carButton.getCurrentFloor()){
            liftMovement=true;
            System.out.println("Lift is going up");
        }
        if(carButton.getDestinationFloor()<carButton.getCurrentFloor()){
            liftMovement=true;
            System.out.println("Lift is going down");
        }
       
        return destinationFloor;
    }


}

