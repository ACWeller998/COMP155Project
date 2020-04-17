//author poorvi (300166550)

public class CarButton {

    int currentFloor;
    int destinationFloor;
    boolean openButton=false;
    boolean closeButton=false;
    boolean emergencyButton=false;
    boolean alarm=false;

    //public CarButton()
    //{}

    public CarButton(int cfloor,int dfloor,boolean obutton,boolean cbutton,boolean ebutton,boolean a) {
        currentFloor=cfloor;
        destinationFloor=dfloor;
        openButton=obutton;
        closeButton=cbutton;
        emergencyButton=ebutton;
        alarm=a;
    }

    public int getCurrentFloor() {
        return destinationFloor;
    }

    public void setCurrentFloor(int curfloor) {
        currentFloor=curfloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destfloor) {
        destinationFloor=destfloor;
    }

    public boolean getOpenButton(){
        return openButton;
    }

    public void setOpenButton(boolean opbutton)
    {
        openButton=opbutton;
    }

    public boolean getCloseButton(){
        return closeButton;
    }

    public void setCloseButton(boolean clbutton)
    {
        closeButton=clbutton;
    }

    public boolean getEmergencyButton(){
        return emergencyButton;
    }

    public void setEmergencyButton(boolean ebutton)
    {
        emergencyButton=ebutton;
    }

    public boolean getAlarm(){
        return alarm;
    }

    public void setAlarm(boolean alarm1)
    {
        alarm=alarm1;
    }

}

