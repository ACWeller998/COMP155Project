//author poorvi(300166550)


public class HallButton {


int currentFloor;
String direction=null;


    public HallButton()
    {}

    public HallButton(int cfloor, String dirn)
    {
    currentFloor=cfloor;
    direction=dirn;
    }

    public int getCurrentFloor()
    {
        return currentFloor;
    }

    public void setCurrentFloor(int floor)
    {
    currentFloor=floor;
    }

    public String getDirection()
    {
        return direction;
    }

    public void setDirection(String direct)
    {
        direction=direct;
    }


}
