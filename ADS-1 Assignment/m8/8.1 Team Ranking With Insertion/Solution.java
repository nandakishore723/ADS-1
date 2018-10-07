import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for selection sort.
 */
class Selection_sort {
	public static void sort(Comparable[] arr) {
		int arr_length = arr.length;
		for (int i = 0; i<arr_length; i++) {
			int min =i;
			for (int j = i + 1; j <arr_length; j++) {
				if (less(arr[j], arr[min])) {
					min = j;
				}
			}
			exch (arr,i,min);
		}
	}

	/**
	 * { function_description }
	 *
	 * @param      v     { parameter_description }
	 * @param      w     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	private static boolean less(Comparable v,Comparable w) {
		return (v.compareTo(w) < 0);
	}

	/**
	 * { function_description }.
	 *
	 * @param      a     { parameter_description }
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}

/**
 * Class for solution.
 */
class Solution {

	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
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
			Team team = new Team(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), 
			Integer.parseInt(tokens[3]));
			teams[i++] = team;
		} 
		Selection_sort.sort(teams);
		String output = "";
		for (Team team : teams) {
			output += team + ","; 
		}
		System.out.print(output.substring(0,output.length() - 1));
	}	
}
