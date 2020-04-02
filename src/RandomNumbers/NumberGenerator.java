//@author Aidan Weller
 package RandomNumbers;
import java.util.Random;
public class NumberGenerator {

   private static Random random = new Random();

    public static int getRandomFloorMax(){
        return random.nextInt(163);
    }

    public static int getRandomWeightMax(){ return random.nextInt(50000);}

    public static int genRandomWeightPerson() { return random.nextInt(1000);}

    public static int genRandomCrowd(){return random.nextInt(20);}
}
