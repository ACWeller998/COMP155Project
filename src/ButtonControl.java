//author poorvi (300166550)

public class ButtonControl
{
    CarButtonControl carButtonControl=new CarButtonControl();
    HallButtonControl hallButtonControl=new HallButtonControl();

    /* TODO
    Get the current and destination floors, create an object of this class and call the required methods
    accordingly to make sure the integration with the ElevatorControl class is fine!
     */

    public boolean movement()
    {
       return carButtonControl.setLiftMovement();
    }
    
    public boolean lights()
    {
       return carButtonControl.setLights();
       
    }
     
    public boolean halllight()
    {
       return hallButtonControl.setHallLight();   
    }
}
