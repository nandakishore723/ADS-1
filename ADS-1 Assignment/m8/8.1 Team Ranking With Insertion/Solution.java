/**
 * import Scanner class
 */
import java.util.Scanner;
/**
 * @author : nandakishore723
 */

final class Solution {
    /**
     * Solution class for Insertion sort program.
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
        /**main method converts the given input data into
        array objects and pass as parameters to the sorting class.**/
        final int three = 3;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
        }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Team[] teams = new Team[lines.length];
        for (String line : lines) {
            String[] tokens = line.split(",");
            Team team = new Team(tokens[0],
                                 Integer.parseInt(tokens[1]),
                                 Integer.parseInt(tokens[2]),
                                 Integer.parseInt(tokens[three]));
            teams[i++] = team;
        }
        Insertion.sort(teams);
        String output = "";
        for (Team team : teams) {
            output += team + ",";
        }
        System.out.print(output.substring(0, output.length() - 1));
    }
}


