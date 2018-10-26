import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nofwrdsinmagz = sc.nextInt();
        int nofwrdsinrnote = sc.nextInt();
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        sc.nextLine();
        String[]magzwrds = sc.nextLine().split(" ");
        String[]rnotewrds = sc.nextLine().split(" ");
        for (int i = 0; i < magzwrds.length; i++) {
            if (st.contains(magzwrds[i])) {
                int count = st.get(magzwrds[i]);
                st.put(magzwrds[i], count + 1);
            } else {
                st.put(magzwrds[i], 1);
            }
        }

        boolean flag = true;
        for (int i = 0; i < rnotewrds.length; i++) {
            if (st.contains(rnotewrds[i])) {
                int count = st.get(rnotewrds[i]);
                if (count == 0) {
                    flag = false;
                    break;
                }
                st.put(rnotewrds[i], count - 1);
            } else {
                flag = false;
                break;
            }
        }
        if (flag == false)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
