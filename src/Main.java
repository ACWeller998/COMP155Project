

public class Main {

    private static ElevatorControl elevator;

    public static void main(String[] args){

        int tempMaxFloor = 10;
        double tempWeightLimit = 5000;
        boolean EXIT = false;
        elevator = new ElevatorControl(tempMaxFloor,tempWeightLimit);
        
        while(EXIT!=true){
            elevator.selectFloor();
            EXIT = true;
        }//Everything goes in here.
    }
}


