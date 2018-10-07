import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {

	private Solution() {
		
	} 

	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner ip = new Scanner(System.in);
		String testcases = ip.nextLine();
		while (ip.hasNext()) {
			String[] line = ip.nextLine().split(" ");
			int people = Integer.parseInt(line[0]);
			int gap = Integer.parseInt(line[1]);
			Deque<Integer> q = new Deque<>();
			createCircle(q, people);
			q.josephus(people, gap);
		}
	}
	public static void createCircle(Deque<Integer> q, int people) {
		for (int i = 0; i < people; i++) {
			q.push(i);
		}
	}
}
