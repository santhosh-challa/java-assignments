package assignment7.Rodents;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("This is Gerbil");
    }

    @Override
    public void jump() {
        System.out.println("Gerbil is Jumping!");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating!");
    }
}
