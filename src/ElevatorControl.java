//@author Aidan Weller
import People.CrowdGenerator;
import RandomNumbers.NumberGenerator;

import java.util.Scanner;
public class ElevatorControl {

//Instantiation of Control objects.
    Dispatcher dispatcher = new Dispatcher();
    private int topFloor;
    private int maxWeight;
    private int totalWeightInElevator;
    private int[] crowdInElevator;
    //Safety safety = new Safety(totalWeightInElevator,maxWeight);

    ElevatorControl(int maxFloor,int weightLimit){
        topFloor = maxFloor;
        maxWeight = weightLimit;
        System.out.println ("Top Floor: " + topFloor + "\n WeightLimit: " + maxWeight);
        CrowdGenerator crowd = new CrowdGenerator(NumberGenerator.genRandomCrowd());
        crowdInElevator = crowd.getCrowd();
        totalWeightInElevator = crowd.getWeight();
        //System.err.println("ElevatorControl.Java: TotalWeightInElevator " + totalWeightInElevator);
        Safety safety = new Safety(totalWeightInElevator,maxWeight);
        safety.WeightCheckElevator();
}

//Elevator Movement Methods.
    public void go(int floor){
        System.out.println("We are at Floor: " + dispatcher.getFloor());
        dispatcher.setFloor(floor,topFloor);
        System.out.println("We are at Floor: " + dispatcher.getFloor());
}

    public int getfloor() {
        int output = dispatcher.getFloor();
        return output;
    }
    //Use this badboi for elevator movement.
    public void selectFloor(){
        Scanner floor = new Scanner(System.in);
        System.out.println("Enter a floor 1-" + topFloor);
        int input = floor.nextInt();
        go(input);
}
//Safety Methods.

}
