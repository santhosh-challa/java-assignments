package assignment5.singleton;

public class Singleton {
    String name;

    public static Singleton getObjRef(String newName){
        /*
        name = newName;
        As the name variable is non static, we can not refer the same here.
        Non static member variables can have different values for different objects.
        But static methods will be shared by all the objects. So at run time, same non static
        can have any value depending on the object creation. So it is not possible to determine the
        value of non static variable in a static method.
         */
        return new Singleton();
    }

    public void printVal(){
        System.out.println(this.name);
    }
}
