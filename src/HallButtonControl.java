//author poorvi(300166550)

public class HallButtonControl
{
    Boolean upLight=false; //Not Set
    Boolean downLight=false;//Not Set

    HallButton hallButton=new HallButton();
     public void setHallLight()
     {
         if(hallButton.getDirection().equals("Up"))
         {
             upLight=true; //Set
         }
         if(hallButton.getDirection().equals("Down"))
             downLight=true;///Set

     }

}
