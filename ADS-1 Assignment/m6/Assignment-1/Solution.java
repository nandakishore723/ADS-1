import java.util.Scanner;

class AddLargeNumbers {

	public static LinkedList numberToDigits(String num) {
		LinkedList newlist = new LinkedList();
    	String[] s = new String[]{num};
    	int i = 0;
    	for (i = 0; i < s.length; i++) {
    		newlist.push(s[i]);
    	}
    	return newlist;
	}

	public static String digitsToNumber(LinkedList list) {
		String num = "";
		int i = 0;
		for (i = 0; i < list.size; i++) {
			num = list.pop();
		}
		return num;
	}

	/*public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		
	}*/
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		/*case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;*/
		}
	}
}
