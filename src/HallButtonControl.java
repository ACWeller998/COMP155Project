//jasnoor

public class HallButtonControl {
    int totalFloor;
    Boolean upLight = false; //not set
    Boolean downLight = false; // not set
    
    HallButton hallButton=new HallButton();
    
    public void setHallLight()
    {
         if(hallButton.getDirection().equals("Up"))
         {
             upLight=true; //set
          }
         if(hallButton.getDirection().equals("Down")){
             downLight=true; //set
             }
             
      
     }
    public int liftLocation(){
        return hallbutton.getFloorNum();
    }
   
    // contructor
    public HallButtonControl(int tFloor) {
        totalFloor = tFloor;
    }
    
    
    //array
    public void store(){
        hallButton[] buttons = new hallButton[200];
        
        for (int i=0; i< buttons.length; i++){
            buttons[i] = new hallButton();
            buttons[i].setbuttons(totalFloor);
        }
        }
}
      
    
     
       
             
             
             
             
        
      
    

             
             
