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
   
    // contructor
    public HallButtonControl(int tFloor) {
        totalFloor = tFloor;
    }
    
    
    //array
    public static void store(){
        hallButton[] buttons = new hallButton[200];
        int total;
        
        for (int i=0; i< buttons.length; i++){
            total = totalFloor.next();
            buttons[i] = new hallButton();
            buttons[i].setbuttons(total);
        }
            
            
        
        }
      
    
     
       
             
             
             
             
        
      
    

             
             
