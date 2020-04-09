//Jasnoor Saran

public class LanternControl {
  
  private int current;
  private int input;
  
  
  
  public int showFloors() {        //this is to show the ongoing lift positions.
   
    Drive drive = new Drive;
    drive.getmovement();
    System.out.println(getmovement);
  }
  
  public int showStop() {       // this is to print the position when lift stopped
    
    Drive drive = new Drive;
    Drive.calculatemovement();
    System.out.println ( calculatemovement );
    
 }
  public int upDown(current , input ){         // this is to print the direction of the elevator(up/down)
    Lantern lantern = new Lantern;
    if (current < input) {
      Lantern.goUp();}
      
    else {
      Lantern.goDown(); }      
    
}
