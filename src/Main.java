

public class Main {

    private static ElevatorControl elevator;

    public static void main(String[] args){

        int tempMaxFloor = 10;
        double tempWeightLimit = 5000;
        boolean EXIT = false;
        elevator = new ElevatorControl(tempMaxFloor,tempWeightLimit);
        
        while(EXIT!=true){
            elevator.go(5, 10);
            EXIT = true;
        }//Everything goes in here.
    }
}



// Scanner floor = new Scanner(System.in);
// 		System.out.println("Enter a floor 1-3.");
// 		int input = floor.nextInt();