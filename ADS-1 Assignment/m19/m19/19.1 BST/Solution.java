import java.util.Scanner;
/**
 * @author : nandakishore723
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bstobj = new BinarySearchTree();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                BookDetails deobj = new BookDetails(tokens[1],
                                                    tokens[2],
                                                    Float.parseFloat(tokens[2 + 1]));
                bstobj.put(deobj, Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                deobj = new BookDetails(tokens[1], tokens[2],
                                        Float.parseFloat(tokens[2 + 1]));
                if (bstobj.get(deobj) == -1) {
                    System.out.println("null");
                } else {
                    System.out.println(bstobj.get(deobj));
                }
                break;
            case "max":
                System.out.println(bstobj.max());
                break;
            case "min":
                System.out.println(bstobj.min());
                break;
            case "select":
                System.out.println(bstobj.select
                    (Integer.parseInt(tokens[1])));
                break;
            case "floor":
                deobj = new BookDetails(tokens[1],
                                        tokens[2],
                                        Float.parseFloat(tokens[2 + 1]));
                System.out.println(bstobj.floor(deobj));
                break;
            case "ceiling":
                deobj = new BookDetails(tokens[1],
                                        tokens[2], Float.parseFloat(tokens[2 + 1]));
                System.out.println(bstobj.ceiling(deobj));
                break;
            default:
                break;
            }
        }
    }
}
