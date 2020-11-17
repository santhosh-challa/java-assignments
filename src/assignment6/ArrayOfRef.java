package assignment6;

public class ArrayOfRef {
    String name = "Santhosh";

    public ArrayOfRef(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        ArrayOfRef[] arr = new ArrayOfRef[5];

        for(int i=0; i<5; i++){
            arr[i] = new ArrayOfRef("Santhosh " + i);
        }

    }
}
