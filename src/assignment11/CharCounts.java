package assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class CharCounts {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = sc.next();

        File dir = new File("/home/santhoshc");
        BufferedReader br = new BufferedReader(new FileReader("/home/santhoshc/"+ fileName));

        Map<Character,Integer> counts = findCount(br);
        writeToFile(counts);

    }

    private static void writeToFile(Map<Character, Integer> counts) throws IOException {
        Properties prop = new Properties();
        for(Map.Entry<Character,Integer> ent : counts.entrySet()){
            prop.put(ent.getKey().toString(),ent.getValue().toString());
        }
        prop.store(new FileOutputStream("counts_map.txt"),null);
    }

    private static Map<Character,Integer> findCount(BufferedReader br) throws IOException {
        String line;
        Map<Character,Integer> counts = new HashMap<>();
        while((line = br.readLine()) != null){
            char[] chars = line.toCharArray();
            for(char c: chars){
                if(counts.containsKey(c))
                    counts.put(c, counts.get(c)+1);
                else
                    counts.put(c,1);
            }
        }
        return counts;
    }

}
