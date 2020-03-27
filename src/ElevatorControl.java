//@author Aidan Weller
public class ElevatorControl {

Dispatcher dispatcher = new Dispatcher();


ElevatorControl(int maxFloor,double weightLimit){
   int constructorMaxFloor = maxFloor;
   double constructorWeightLimit = weightLimit;


}


public void go(int floor ,int maxFloor){
    System.out.println("We are at Floor: " + dispatcher.getFloor());
    dispatcher.setFloor(floor,maxFloor);
    System.out.println("We are at Floor: " + dispatcher.getFloor());
}
    public int getfloor() {
        int output = dispatcher.getFloor();
        return output;
    }
}
