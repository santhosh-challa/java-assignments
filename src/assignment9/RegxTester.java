package assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text to validate: ");
        String inp = sc.next();
        validateInput(inp);
    }

    private static void validateInput(String inp) {
        Pattern pat = Pattern.compile("^[A-Z].*[\\.]$");
        Matcher match = pat.matcher(inp);
        if(match.find()){
            System.out.println("It starts with a capital and ends with a period!");
        }else{
            System.out.println("Did not match with the pattern!");
        }
    }
}
