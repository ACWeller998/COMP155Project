package People;
import RandomNumbers.NumberGenerator;

public class Crowd {

    private int numOfPeople;
    private int[] group;

    public Crowd(int numOfPeople) {

        group = new int[numOfPeople];
        this.numOfPeople = numOfPeople;
        System.err.println("Crowd.java: How many People are riding: " + this.numOfPeople);
        for (int i = 0; i < this.numOfPeople; i++) {

            group[i] = NumberGenerator.genRandomWeightPerson();
            //System.out.println("Person added at " + i + "Value of " + i + ":" + group[i]);
        }
    }

    public int[] getCrowd() {
        return group;
    }

    public int weightOfCrowd() {
        int totalWeight = 0;
        for(int i=0;i<group.length;i++) {
            totalWeight += group[i];
        }
        //System.err.println("Crowd.Java TotalWeight: " + totalWeight);
        return totalWeight;
    }

}