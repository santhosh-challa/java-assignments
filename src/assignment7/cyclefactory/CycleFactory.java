package assignment7.cyclefactory;

public class CycleFactory {
    public Cycle makeCycle(String cycleType){
        if(cycleType == null)
            return null;

        if(cycleType.equalsIgnoreCase("UNICYCLE"))
            return new Unicycle();

        if(cycleType.equalsIgnoreCase("BICYCLE"))
            return new Bicycle();

        if(cycleType.equalsIgnoreCase("TRICYCLE"))
            return new Tricycle();

        return null;
    }
}
