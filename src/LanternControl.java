public class LanternControl {
  
  private int current;
  private int input;
  
  
  
  public int showFloors() {
   
    Drive drive = new Drive;
    drive.getmovement();
    System.out.println(getmovement);
  }
  
  public int showStop() {
    
    Drive drive = new Drive;
    Drive.calculatemovement();
    System.out.println ( calculatemovement );
    
 }
  public int upDown(){
    Lantern lantern = new Lantern;
    if (current < input) {
      Lantern.goUp();}
      
    else {
      Lantern.goDown(); }      
    
}
