//@author Aidan Weller
import People.CrowdGenerator;
import RandomNumbers.NumberGenerator;

import java.util.Scanner;
public class ElevatorControl {

//Instantiation of Control objects.
    Dispatcher dispatcher = new Dispatcher();
    LanternControl lantern = new LanternControl();
    
    private int topFloor;
    private int maxWeight;
    private int totalWeightInElevator;
    private int[] crowdInElevator;
    private int rememberMe;
    

    Safety safety;
    //Safety safety = new Safety(totalWeightInElevator,maxWeight);

    ElevatorControl(int maxFloor,int weightLimit){
        topFloor = maxFloor;
        maxWeight = weightLimit;
        System.out.println ("Top Floor: " + topFloor + "\n WeightLimit: " + maxWeight);
}

//Elevator Movement Methods.
    public void go(int floor){
        System.out.println("We are at Floor: " + dispatcher.getFloor());
       //The current position of the car
        for (int count = 0; count <= floor; count++ ) {
    	   dispatcher.setFloor(count, topFloor);
    	   lantern.getPosition();
       }
        this.rememberMe = floor;
        
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
        doCrowdMath();
        rollForRandomDisaster();
        go(input);
}
//Safety Methods.
    public void doCrowdMath(){
        CrowdGenerator crowd = new CrowdGenerator(NumberGenerator.genRandomCrowd());
        crowdInElevator = crowd.getCrowd();
        totalWeightInElevator = crowd.getWeight();
        //System.err.println("ElevatorControl.Java: TotalWeightInElevator " + totalWeightInElevator);
        safety = new Safety(totalWeightInElevator,maxWeight);
        safety.WeightCheckElevator();
    }
    public void rollForRandomDisaster(){
       boolean result = safety.rollDisaster();
       if(result){
           System.err.println("You rolled a nat one on your disaster check!");
           return;
        }else
       if(!result){
           System.out.println("You passed your disaster check!");
       }
    }
}
