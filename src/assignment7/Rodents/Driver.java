package assignment7.Rodents;

public class Driver {
    public static void main(String[] args) {
        Rodent[] arr = new Rodent[3];
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();

        for(Rodent r : arr){
           r.eat();
           r.jump();
        }
    }
}
