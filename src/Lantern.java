//Jasnoor

public class Lantern {
    private int input; //floor that user inputted
    private int current;
    DriveControl lantern = new DriveControl();
    
 // public void lightdecision() {
    //if (current < input) {
// 	driveControl.setPosition(input);
// 	driveControl.setDirection("UP");
 // System.out.println (setdirection)
// 	int p = driveControl.getPosition();
// 	String d = driveControl.getDirection();
// 	m.setMovement(p,d);
    
// else if (current > input) {
// 	driveControl.setPosition(input);
// 	driveControl.setDirection("DOWN");
  // System.out.println (setdirection)
// 	int p = driveControl.getPosition();
// 	String d = driveControl.getDirection();
// 	m.setMovement(p,d);

// }
    
    OR
    
  public void current() {
      System.out.println("The Current floor number" + currentfloor);
    //here the lantern will print the current floor and is the next step will be to ask the user about the inout after which the lantern will print msgs accordingly
    }
    
    
  public void goTo(int currentfloor, int floornumber){
      if ( currentfloor > floorNumber){
      elevatorsignalUp();}
      else if ( c_Floor < floorNumber){
      elevatorsignalDown();}  
    }
    
    
  public void elevatorsignalUp(){
    System.out.println(" ↑ ");//the elevator will show an upward arrow while going up
   
 }
    
  public void elevatorsignalDown(){
    System.out.println(" ↓ ");
    } 
   
}


