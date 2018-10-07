import java.util.Scanner;

/**
 * Class for pairstar.
 */
public class pairstar {

	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(pairstar(str));
	}

	/**
	 * { function_description }.
	 *
	 * @param      str   The string
	 *
	 * @return     { description_of_the_return_value }
	 */
	static String pairstar(final String str) {
		int len = str.length();
		int i = 0;
		String temp = "";
		if (i < len - 1) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return temp += str.charAt(i) + "*" + pairstar(str.substring(1));
			} else {
				return temp += str.charAt(i) + pairstar(str.substring(1));
			}
		}
		return temp + str.charAt(i);
	}
}
