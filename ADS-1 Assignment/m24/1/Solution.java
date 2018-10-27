import java.util.Scanner;

/**
 * Class for solution.
 */
class Solution {

	/**
	 * Constructs the object.
	 */
	private Solution() {
		//unused
	}

	/**
	 * main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n =Integer.parseInt(ip.nextLine());
		SeparateChainingHashST<Integer, Student> schObj= new SeparateChainingHashST<>();
		int i;
		for (i = 0; i < n; i++){
			String[] tokens = ip.nextLine().split(",");
			Student stdObj = new Student(tokens[1],Double.parseDouble(tokens[2]));
			schObj.put(Integer.parseInt(tokens[0]), stdObj);
		}
		int m = Integer.parseInt(ip.nextLine());
		int j;
		for (j = 0; j <m; j++){
			String[] queryTokens = ip.nextLine().split(" ");
			if (queryTokens[0].equals("get")) {
				if (Integer.parseInt(queryTokens[2]) == 1) {
					if (schObj.get(Integer.parseInt(queryTokens[1])) == null) {
						System.out.println("Student doesn't exists...");
					} /*else {
						System.out.println(schObj.get(Integer.parseInt(queryTokens[1])).getstudentname());

						if (schObj.get(Integer.parseInt(queryTokens[1])) == null) {
							System.out.println("Student doesn't exists...");
						} else {
							System.out.println(schObj.get(Integer.parseInt(queryTokens[1])).gettotalmarks());
						}
					}*/
				}
			}
		}
	}
}
