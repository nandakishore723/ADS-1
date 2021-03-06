import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner ip = new Scanner(System.in);
        MyQueue mq =  new MyQueue();
        int k = ip.nextInt();
        while (ip.hasNext()) {
            String[] token = ip.nextLine().split(" ");
            switch (token[0]) {
            case "pushLeft":
                mq.pushLeft(token[1]);
                System.out.println(mq);
                break;
            case "pushRight":
                mq.pushRight(token[1]);
                System.out.println(mq);
                break;
            case "popLeft":
                if (mq.size > 0) {
                    mq.popLeft();
                    System.out.println(mq);
                } else {
                    System.out.println("Deck is empty");
                }
                break;
            case "popRight":
                if (mq.size > 0) {
                    mq.popRight();
                    System.out.println(mq);
                } else {
                    System.out.println("Deck is empty");
                }
                break;
            case "size":
                System.out.println(mq.size());
                break;
            default:
                break;

            }

        }
    }
}
