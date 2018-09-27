import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public class Solution {
	/**.
	 * { function_description }
	 *
	 * @param      a     { parameter_description }
	 * @param      b     { parameter_description }
	 */
	public void mergeArrays(final int[] a, final int[] b) {
		
		int i = 0;
		int j = 0;
		int k = 0;

		int[] c = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		if (i == a.length) {
			while (j < b.length) {
				c[k] = b[j];
				j++;
				k++;
			}
		} else {
			while (i < a.length) {
				c[k] = a[i];
				i++;
				k++;
			}
		}
		int x;
		for (x = 0; x < c.length - 1; x++) {
			System.out.print(c[x] + ",");
		}
		System.out.println(c[x]);
	}
	/**
	 * . { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner ip = new Scanner (System.in);
		int m = Integer.parseInt(ip.nextLine());
		int n = Integer.parseInt(ip.nextLine());

		int[] a = new int[m];
		int[] b = new int[n];

		String [] elements;

		if (m != 0) {
			elements = ip.nextLine().split(",");
			for (int i = 0; i < elements.length; i++) {
				a[i] = Integer.parseInt(elements[i]);
			}
		} else {
			ip.nextLine();
		}

		if (n != 0) {
			elements = ip.nextLine().split(",");
			for (int i = 0; i < elements.length; i++) {
				b[i] = Integer.parseInt(elements[i]);
			}
		}
		new Solution().mergeArrays(a, b);
	}
}
