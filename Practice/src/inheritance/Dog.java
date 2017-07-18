package inheritance;

public class Dog extends Animal {
    String name;
    public Dog() {
        //super();
        System.out.println("A new dog has been created!");
    }
    public Dog(String S) {
        super(S);
        this.name=S;
        System.out.println("A new dog "+S+" has been created!");}
    public void sleep() {System.out.println("A dog sleeps...");}
    public void eat() {System.out.println("A dog "+name+" eats...");}
}
