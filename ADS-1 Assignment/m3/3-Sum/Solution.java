import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    /**
         * Constructs the object.
         */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner ip = new Scanner(System.in);
        int k, n, cnt = 0;
        n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int x = n - 1;
            while (j < x) {
                if (arr[i] + arr[j] + arr[x] == 0) {
                    cnt++;
                    j++;
                    x--;

                } else if (arr[i] + arr[j] + arr[x] < 0) {
                    j++;

                } else {
                    x--;
                }
            }

        }
        System.out.println(cnt);
    }
}
