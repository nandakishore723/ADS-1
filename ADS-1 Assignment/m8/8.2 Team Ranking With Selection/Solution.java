/**
 * @author : nandakishore723
 */
import java.util.Scanner;

final class Solution {
    /**
     * Solution class for Selection sort program.
     *
     */

    private Solution() {
        /**
         * { item_description }.
         */
    }

    /**
     * Main function to take inputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * In main method the given input is split into tokens and
         * these tokens are passed as parameters to the selection
         * sort class.
         */
        final int three = 3;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
            // System.out.println(sb);
        }
        String[] lines = sb.toString().split("::");
        // System.out.println(sb.toString().split("::"));
        int i = 0;
        Team[] teams = new Team[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            Team team = new Team(tokens[0], Integer.parseInt(tokens[1]),
                                 Integer.parseInt(tokens[2]),
                                 Integer.parseInt(tokens[three]));
            teams[i++] = team;
        }
        Selection.sort(teams);
        String output = "";
        for (Team team : teams) {
            output += team + ",";
        }
        System.out.print(output.substring(0, output.length() - 1));
    }
}


