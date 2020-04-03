//@author Aidan Weller
import RandomNumbers.NumberGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static ElevatorControl elevator;

    public static void main(String[] args){
//Behind the curtain hardcoded temp stuff.
//      int tempMaxFloor = 10;
//      double tempWeightLimit = 5000;

       Scanner menuInput = new Scanner(System.in);

       int maxfloor = NumberGenerator.getRandomFloorMax();
       int maxWeight = NumberGenerator.getRandomWeightMax();

       boolean EXIT = false;
        elevator = new ElevatorControl(maxfloor,maxWeight);
        while(!EXIT) {
            System.out.println("Welcome to the Elevator Simulator.");
            System.out.println("Here's some options for you: ");
            System.out.println("1: Go to a floor.  2: Quit. ");
            int userInput = 0;
            try{
                userInput = menuInput.nextInt();
            }
            catch(InputMismatchException ex) {
                System.err.println("Sorry that was an invalid input.");
            }
            switch (userInput) {
                case 1:
                    elevator.selectFloor();
                    break;
                case 2:
                    EXIT = true;
                    break;
                default:
                    EXIT = true;
                    break;
            }
        }//Everything goes in here.
    }
}


