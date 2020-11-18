package assignment7.innerclass;

public class Class2 {
    static class Inner2 extends Class1.Inner1 {
        String name;

        Inner2(String name) {
            new Class1().super(name);
        }
    }

    public static void main(String[] args) {
        Class2.Inner2 in = new Class2.Inner2("santhosh");
    }
}
