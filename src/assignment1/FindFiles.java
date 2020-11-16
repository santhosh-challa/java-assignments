package assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFiles {
    public static void main(String[] args) {
        String pattern = null;
        File dir = new File("/home/santhoshc");
        Scanner scan = new Scanner(System.in);

        // This program needs to take inputs continuously
        while (true) {
            // read the regex pattern
            System.out.println("Please Enter the Regular Expression Pattern:");
            pattern = scan.next();
            findFiles(pattern,dir);
        }
    }

    private static void findFiles(String pattern, File dir) {

        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files)
                if (f.isDirectory()) {
                    findFiles(pattern, f);
                } else
                    // check if file name is matching with given regex
                    printMatchingFiles(pattern, f);
        }
    }

    private static void printMatchingFiles(String pattern, File f) {
        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher(f.getName());
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println(f.getAbsolutePath());
        }
    }
}

