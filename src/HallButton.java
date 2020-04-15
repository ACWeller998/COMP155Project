//Jasnoor Saran

public class HallButton {
  boolean upButton= false;
  boolean downButton=false;
  
  
  public HallButton(boolean ubutton,boolean dbutton){
    upButton=ubutton;
    downButton=dbutton;
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
}
    
  
  
  
  



