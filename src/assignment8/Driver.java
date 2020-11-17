package assignment8;

public class Driver {
    public static void expTest(int num) throws Exception1, Exception2, Exception3 {
        if(num == 1){
            throw new Exception1("Exception 1.");
        } else if(num ==2){
            throw new Exception2("Exception 2.");
        }else if(num ==3){
            throw new Exception3("Exception 3.");
        }
    }
    public void test(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        try {
            expTest(1);
            /*
            * This is for testing the null pointer exception.
            * Driver d = null;
            * d.test();
             */
        }catch (Exception1 | Exception2 | Exception3 e){
            System.out.println("Exception Occurred: " + e);
        }finally {
            System.out.println("This is Finally");
        }
    }
}
