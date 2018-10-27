import java.util.Scanner;
import java.util.HashMap;
/**
 * Class for soution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		HashMap<Integer, Student> hashmap = new HashMap<Integer, Student>(n);
		int i;
		for (i = 0; i < n; i++) {
			String line = scan.nextLine();
			String[]sdata = line.split(",");
			hashmap.put(Integer.parseInt(sdata[0]), new Student(sdata[1], Double.parseDouble(sdata[2])));
		}
		int m = Integer.parseInt(scan.nextLine());
		int j;
		for (j = 0; j < n; j++) {
			String line = scan.nextLine();
			String[]qdata = line.split(",");
			Student stud = hashmap.get(Integer.parseInt(qdata[1]));
			if (stud == null) {
				System.out.println("Student doesn't exists...");
			} else if (qdata[2].equals("1")) {

				System.out.println(stud.getstudentname());

			} else if (qdata[2].equals("2")) {
				System.out.println(stud.gettotalmarks());
			}
		}

	}
}
