import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int[] val = new int[n];
		for (int i = 0; i < n; i++) {
			val[i] = ip.nextInt();
		}

		int cnt = 0;
		int chck = 1;
		Arrays.sort(val);
		for (int i = 0; i < val.length - 1; i++) {
			if (val[i] == val[i + 1]) {
				chck += 1;
			} else {
				cnt += chck * (chck - 1) / 2;
				chck = 1;
			}
		}
		cnt += chck * (chck - 1) / 2;
		System.out.println(cnt);
	}
}
