package assignment7.cyclefactory;

public class Driver {
    public static void main(String[] args) {
        CycleFactory mkCycle = new CycleFactory();
        Cycle uni = mkCycle.makeCycle("UniCycle");
        uni.balance();
        Cycle bic = mkCycle.makeCycle("BICycle");
        bic.balance();
        Cycle tri = mkCycle.makeCycle("TRICycle");
        tri.balance();
    }
}
