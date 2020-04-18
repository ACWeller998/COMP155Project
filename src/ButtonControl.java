//author poorvi (300166550)

public class ButtonControl
{
    //creating objects of the CarButtonControl and HallButtonControl
    
    CarButtonControl carButtonControl=new CarButtonControl();
    HallButtonControl hallButtonControl=new HallButtonControl();

   

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
    
    public int location()
    {
        return hallButtonControl.liftLocation();
        
    }
    
   /* public int inputarray()
    {
       return hallbuttonControl.store()   
    }*/
}

