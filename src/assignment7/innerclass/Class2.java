package assignment7.innerclass;

public class Class2{
    class inner2 extends Class1.inner1{
        /*
         * Compiler is trowing the error if there is no default constructor
         * in inner class1.
         *
         * Also, need to make a call to inner class constructor  using
         * Class1, to avoid another error.
         */
    inner2(Class1 cls){
        cls.super("Santhosh");
    }
    }
}
