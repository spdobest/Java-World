package spm.java.world.encapsulation;


/**
 * If all the variables and its methods are binded inside a block of code named class
 * this is known as Encapsulation
 * <p>
 * Here we declare the variable and its getter setter methods inside Encapsulation Class
 * So this is known as Encapsulation
 * <p>
 * This is also known as Tightly Encapsulated, because all the fields in this class are defined as private.
 */
public class Encapsulation {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
