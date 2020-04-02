package People;

public class CrowdGenerator {
    private int numofPeople;
    Crowd crowd;

    public CrowdGenerator(int numofPeople){
    this.numofPeople = numofPeople;
    //System.out.println("CrowdGenerator.java: " + this.numofPeople);
    crowd = new Crowd(this.numofPeople);
    }

    public int[] getCrowd() {
       return crowd.getCrowd();
    }

    public int getWeight() {
        int WeightOfCrowd = crowd.weightOfCrowd();
        //System.err.println("CrowdGenerator.Java: Show me bugs: " + WeightOfCrowd);
        return WeightOfCrowd;
    }
}
