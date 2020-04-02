//@author Aidan Weller
import RandomNumbers.NumberGenerator;
import People.*;
public class Main {

    private static ElevatorControl elevator;

    public static void main(String[] args){
//Behind the curtain hardcoded temp stuff.
//        int tempMaxFloor = 10;
//        double tempWeightLimit = 5000;

       int maxfloor = NumberGenerator.getRandomFloorMax();
       int maxWeight = NumberGenerator.getRandomWeightMax();

       boolean EXIT = false;
        elevator = new ElevatorControl(maxfloor,maxWeight);
        while(!EXIT){

            elevator.selectFloor();

            EXIT = true;
        }//Everything goes in here.
    }
}


