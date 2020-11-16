package assignment2;

public class ContainsAtoZ {
    private static boolean evaluateChars(String input) {
        boolean[] visited = new boolean[26];
        int idx = 0;
        findUniqueChars(input, visited, idx);
        //check if all the charcs a-z exists in the input or not
        return checkAllCharsExist(visited);
    }

    private static boolean checkAllCharsExist(boolean[] visited) {
        for (int id = 0; id < 26; id++)
            if (!visited[id])
                return false;
        return true;
    }

    private static void findUniqueChars(String input, boolean[] visited, int idx) {
        for (int pos = 0; pos < input.length(); pos++) {
            if ('a' <= input.charAt(pos) && input.charAt(pos) <= 'z') {
                idx = input.charAt(pos) - 'a';
            }
            /* update the visited for the corresponding char */
            visited[idx] = true;
        }
    }

    public static void main(String[] args) {
        String inp = "abcdefghijklmnopqRstuvwxyzZZZZZ";
        System.out.println(evaluateChars(inp.toLowerCase()));
    }
}
