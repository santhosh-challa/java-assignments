package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MedianOfPing {
    private static void calculateMedian(ArrayList<String> command) {
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            /* execute the ping and get the return times */
            ArrayList<Double> times = executeCommand(pb);
            // calculate median
            printMedian(times);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMedian(ArrayList<Double> times) {
        Collections.sort(times);
        int totElements = times.size();
        if (totElements % 2 == 0)
            System.out.println("Median is: " + (times.get((totElements - 1) / 2)
                                                         + times.get((totElements / 2))) / 2.0);
        else
            System.out.println("Median is: " + (times.get(totElements/2)));
    }

    private static ArrayList<Double> executeCommand(ProcessBuilder pb) throws IOException {
        Process process = pb.start();
        // try capturing the ping output
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        ArrayList<Double> times = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            // capture the ping timings
            if (line.contains("time=")) {
                String[] words = line.split(" ");
                String[] reqtime = words[7].split("=");
                times.add(Double.parseDouble(reqtime[1]));
            }
        }
        return times;
    }

    public static void main(String[] args) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("-c");
        commands.add("10");
        commands.add("www.google.com");
        calculateMedian(commands);
    }
}
