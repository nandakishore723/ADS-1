import java.util.Scanner;
public class Solution {

	private Solution() {
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int sLen = Integer.parseInt(ip.nextLine());
		int a = 6;
		for (int i = 0; i < a; i++) {
			int cnt = 0;
			MinPQ<StockData> minpqObj = new MinPQ<>();
			MaxPQ<StockData> maxpqObj = new MaxPQ<>();
			while (cnt < sLen) {
				String[] tokens = ip.nextLine().split(",");
				StockData stockObj = new StockData(tokens[0], Float.parseFloat(tokens[1]));
				minpqObj.insert(stockObj);
				maxpqObj.insert(stockObj);
				cnt++;
			}

			BinarySearchTree<String, Float> stockbest = new BinarySearchTree<>();
			BinarySearchTree<String, Float> stockworst = new BinarySearchTree<>();
			int b = 5;
			for (int j = 0; j < b; j++) {
				StockData maxpqbest = maxpqObj.delMax();
				stockbest.put(maxpqbest.getname(), maxpqbest.getperchange());
				StockData minpqworst = minpqObj.delMin();
				stockworst.put(minpqworst.getname(), minpqworst.getperchange());
			}

			stockbest.print();
			System.out.println();
			stockworst.print();
			System.out.println();
		}
	}
}
