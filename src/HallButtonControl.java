//jasnoor

public class HallButtonControl {
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
        //normal array with inputs manually
        buttons[0] = hallButton.getupButton();
        buttons[1] = hallButton.getdownButton();
        
        //using the for loop
        
        for (int i=0; i< buttons.length; i++){
            total = tfloor.next();
            buttons[i] = new hallButton();
            buttons[i].setbuttons(total);
        }
            
            
        
        }
      
    
     
       
             
             
             
             
        
      
    

             
             
