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
        int array[];
        array = new int [tfloor];
        for (int i = 0; i< array.length; i++) {
            array[i] = scan.nextLine();
        }
        
        
        //an idea 
     boolean goUP = false;
     boolean goDown = false;
        
     public int setupwardmovement(int currentposition, int array []) {
         for (array [i] > hallButton.getcurrentposition()){
             goUP = true; //set
             currentposition = array [i];
             i++;
         }
         
     public int setdownwardmovement(int currentposition, int array[]) {
         for (array[i] < hallButton.getcurrentposition()) {
             goDown = true; //set
             currentposition = array [i];
             i++;
         }
             
             
             
             
        
      
    

             
             
