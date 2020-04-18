//Jasnoor Saran

public class HallButton {
  boolean upButton= false;
  boolean downButton=false;
  String direction= null;
  
  
  
  public HallButton(boolean ubutton,boolean dbutton, String dirn){
    upButton=ubutton;
    downButton=dbutton;
    direction=dirn;
  }
  
  
  public boolean getupButton(){
    return upButton;
  }
  
  public void setupButton(boolean ubutton){
    upButton=ubutton;
  }
  
  public boolean getdownButton(){
    return downButton;
  }
  public void setdownButton(boolean dbutton){
    downButton=dbutton;
  }
  public String getDirection(){
    return direction;
  }
  public void setDirection(String dirn){
    direction=dirn;
  }
 
    
}
  
  
  



