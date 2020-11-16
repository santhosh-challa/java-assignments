package assignment4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class KYCDates {
    private static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    private static void getFormDates(String annvDate, String currDate) {

        LocalDate currD = LocalDate.parse(currDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate annvD = LocalDate.parse(annvDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        if (annvD.compareTo(currD) > 0) {
            System.out.println("No Range");
        } else {
            int currYear = currD.getYear();
            int anvYear = annvD.getYear();
            LocalDate currAnnv = annvD.plusYears(currYear - anvYear);
            LocalDate fromDate = currAnnv.minusDays(30);
            LocalDate toDate = currAnnv.plusDays(30);

            printDateRanges(currD, fromDate, toDate);
        }
    }

    private static void printDateRanges(LocalDate currD, LocalDate fromDate, LocalDate toDate) {
        // verify whether the toDate is less or greater than the given currdate
        if (toDate.compareTo(currD) > 0) {

            System.out.print(fromDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.print(" ");
            System.out.print(currD.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.println();
        } else {

            System.out.print(fromDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.print(" ");
            System.out.print(toDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int noOfInputs = scan.nextInt();
        // read input dates and call the function to print the date ranges
        ArrayList<String> annvDates = new ArrayList<>();
        ArrayList<String> currDates = new ArrayList<>();

        for (int i = 0; i < noOfInputs; i++) {
            String annvDate = scan.next();
            String currDate = scan.next();
            annvDates.add(annvDate);
            currDates.add(currDate);
        }

        for (int index = 0; index < noOfInputs; index++)
            getFormDates(annvDates.get(index), currDates.get(index));
    }
}

