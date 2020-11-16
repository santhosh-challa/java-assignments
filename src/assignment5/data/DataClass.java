package assignment5.data;

public class DataClass {
    int number;
    char chr;

    public DataClass(){}

    public void printVar(){
        System.out.println("Number: " +number);
        System.out.println("Char: " + chr);
    }

    public void printLocal(){
        int num;
        char chr1;
        /*
        System.out.println("Number: " +num);
        System.out.println("Char: " + chr1);

        Local variables must be initialized before using them. In case of local variables,
        compiler knows that it is sequential and it may cause some issues if the same unassigned
        variables arr used.

        In case of class/instance variables, compiler may not sue where and when they gets initialized.
        So in it assigns some default values to avoid any issues.

         */

    }
}
