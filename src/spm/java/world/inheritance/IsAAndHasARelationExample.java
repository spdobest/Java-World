package spm.java.world.inheritance;


/**
 * Normal Inheritance is known as inheritance
 * By extending another class we can achieve Is A Relation
 */
public class IsAAndHasARelationExample {
    public static void main(String[] args) {
        Pulsar myPulsar = new Pulsar();
        myPulsar.setColor("BLACK");
        myPulsar.setMaxSpeed(136);
        myPulsar.bikeInfo();
        myPulsar.PulsarStartDemo();
    }
}

class Bike {
    private String color;
    private int maxSpeed;

    public void bikeInfo() {
        System.out.println("Bike Color= " + color + " Max Speed= " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void myOverrideMethod() {

    }
}

class Pulsar extends Bike {
    protected static void myOverrideMethod() {

    }

    public void PulsarStartDemo() {
        Engine PulsarEngine = new Engine();
        PulsarEngine.stop();
    }
}

class Engine {
    public void start() {
        System.out.println("Started:");
    }

    public void stop() {
        System.out.println("Stopped:");
    }
}