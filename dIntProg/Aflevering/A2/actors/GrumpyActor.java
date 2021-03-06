/**
 * Models a grumpy actor.
 */
public class GrumpyActor extends Actor {

    /**
     * Creates a new grumpy actor.
     * @param name the name of the grumpy actor
     */
    public GrumpyActor(String name){
        super(name);    
    }
    
    /**
     * Refuses to clap.
     * @param n the number of claps
     */
    public void clap(int n) {
        refuse();
        number = number + n;
    }
    
    /**
     * Refuses to turn.
     */
    public void turn(int n) {
        refuse();
        number = number + n;
    }
    
    /**
     * Refuses to print the number of tricks performed so far.
     */
    public void printNumberOfTricks() {
        refuse();
    }

    private void refuse() {
        System.out.println("Do it yourself! (" + name + ")");
    }
}
