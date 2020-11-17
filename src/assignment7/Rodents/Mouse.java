package assignment7.Rodents;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("This is Mouse!!");
    }
    @Override
    public void eat() {
        System.out.println("Mouse is eating!");
    }

    @Override
    public void jump() {
        System.out.println("Mouse is Jumping!");
    }
}
