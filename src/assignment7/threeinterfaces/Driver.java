package assignment7.threeinterfaces;

public class Driver {
    private static void intMethod1(Interface1 int1){

    }
    private static void intMethod2(Interface2 int2){

    }
    private static void intMethod3(Interface3 int3){

    }
    private static void intMethod4(Interface4 int4){

    }

    public static void main(String[] args) {
        Child ch = new Child();
        intMethod1(ch);
        intMethod2(ch);
        intMethod3(ch);
        intMethod4(ch);
    }
}
