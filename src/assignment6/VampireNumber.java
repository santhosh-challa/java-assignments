package assignment6;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumber {
    public static int numDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }

    public static boolean validFactors(long orig, long num1, long num2){
        // If both numbers ends with '0' there are invalid
        if(Long.toString(num1).endsWith("0") && Long.toString(num2).endsWith("0"))
            return false;

        // check no of digits
        int totDigits = numDigits(orig);
        if(numDigits(num1) != totDigits/2 || numDigits(num2) != totDigits/2)
            return false;

        // check the digits
        return checkIfDigitsAreSame(orig, num1, num2);
    }

    private static boolean checkIfDigitsAreSame(long orig, long num1, long nunm2) {
        byte[] origBytes = Long.toString(orig).getBytes();
        byte[] factBytes = (Long.toString(num1) + Long.toString(nunm2)).getBytes();
        Arrays.sort(origBytes);
        Arrays.sort(factBytes);
        return Arrays.equals(origBytes, factBytes);
    }

    private static void printVampireNumbers(int totNum){
        HashSet<Long> vampNums = new HashSet<>();
        for(long i=10; vampNums.size() <=totNum; i++){
            if(numDigits(i) % 2 !=0){
                i = i*10 -1;
                continue;
            }
            for(long num1=2; num1<= Math.sqrt(i) +1; num1++){
                if(i % num1 == 0){
                    long num2 = i /num1;
                    if(validFactors(i,num1,num2) && num1 <= num2){
                        vampNums.add(i);
                        System.out.println("Vampire number: " + i + " with factors: [" + num1 + ", " + num2 +"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
       printVampireNumbers(100);
    }
}
