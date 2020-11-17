package assignment7.Rodents;

public abstract class Rodent {
    Rodent(){
        System.out.println("This is Rodent!!");
    }
    public void eat(){
        System.out.println("Rodent is eating!");
    }
    public abstract void jump();
}
