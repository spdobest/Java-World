package spm.java.world.inheritance;


/**
 * Child can access all the properties except private properties
 * <p>
 * Parent Object can hold the object of child class. By using this reference we can call only super class methods not the child class methods.
 * <p>
 * Child can not hold the object of Parent class - By using this reference we can call super as well as its own methods.
 */
public class InheritanceExample1 {

    public static void main(String... args) {

        Child1 child1 = new Child1("SIba", 21);

        child1.printAge();


        Parent1 p1 = new Child1("Satya", 31);
        p1.age = 31;
        p1.printAge();
        p1.printName();


    }


}


class Child1 extends Parent1 {


    protected int age;
    private String name;

    Child1(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printName() {
        System.out.println("Child class name is " + this.name);
    }

    void printAge() {
        super.printAge();
        System.out.println("Child class Age is" + this.age);
    }

}


class Parent1 {

    protected int age;
    private String name;

    Parent1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {

        System.out.println("Super class name " + this.name);
    }

    void printAge() {
        System.out.println("Super class Age is" + this.age);
    }

}
