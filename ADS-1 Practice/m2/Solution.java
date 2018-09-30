import java.util.*;

public class Solution {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch(line[0]) {
                case "size":
                System.out.println(ll.size());
                break;
                case "pushLeft":
                ll.pushLeft(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "pushRight":
                ll.pushRight(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "popLeft":
                ll.popLeft();
                System.out.println(ll);
                break;
                case "popRight":
                ll.popRight();
                System.out.println(ll);
                break;
                case "print" :
                ll.toString();
                System.out.println(ll);
                break;
                default:
                break;
            }
        }
    }
}

