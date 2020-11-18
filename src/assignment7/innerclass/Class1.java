package assignment7.innerclass;

public class Class1 {
    class Inner1{
        String name;
        Inner1(){}
        public Inner1(String name){
            this.name = name;
            System.out.println("Inner1: Value of param name is: "+ name);
        }
    }
}
