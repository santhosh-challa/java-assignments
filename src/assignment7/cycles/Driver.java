package assignment7.cycles;

public class Driver {
    public static void main(String[] args) {

        // Upcasting
        Cycle[] arr = {new Unicycle(), new Bicycle(), new Tricycle()};

        for(Cycle c: arr){
            c.balance();
        }
        // Down casting

        ((Unicycle)arr[0]).balance();
        ((Bicycle)arr[1]).balance();
        ((Tricycle)arr[2]).balance();
    }
}
