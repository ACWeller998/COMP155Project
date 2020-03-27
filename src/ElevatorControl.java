import java.util.Scanner;

//@author Aidan Weller
public class ElevatorControl {

Dispatcher dispatcher = new Dispatcher();
    private int topFloor;
    private double maxWeight;

ElevatorControl(int maxFloor,double weightLimit){
    topFloor = maxFloor;
    maxWeight = weightLimit;
    System.out.println ("Top Floor: " + maxFloor + "\n WeightLimit: " + weightLimit);
}

public void go(int floor){
    System.out.println("We are at Floor: " + dispatcher.getFloor());
    dispatcher.setFloor(floor,topFloor);
    System.out.println("We are at Floor: " + dispatcher.getFloor());
}

    public int getfloor() {
        int output = dispatcher.getFloor();
        return output;
    }
public void selectFloor(){
     Scanner floor = new Scanner(System.in);
     System.out.println("Enter a floor 1-" + topFloor);
     int input = floor.nextInt();
     go(input);
}

}
