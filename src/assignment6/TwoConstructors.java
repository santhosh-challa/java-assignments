package assignment6;

public class TwoConstructors {
    int num;
    String name;
    TwoConstructors(int num){
        this.num = num;
    }

    TwoConstructors(String name, int num){
        this(num);
        this.name = name;
    }
}
