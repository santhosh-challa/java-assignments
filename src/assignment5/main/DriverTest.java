package assignment5.main;

import assignment5.data.DataClass;
import assignment5.singleton.Singleton;

public class DriverTest {
    public static void main(String[] args) {
        DataClass data = new DataClass();
        data.printVar();
        data.printLocal();

        Singleton sg = Singleton.getObjRef("Santhosh");
        sg.printVal();
    }
}
