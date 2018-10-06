
public class Solution {
    private Solution() {
        
    }
    public static void mertiList(Student[] a, int vacancy, int open, int bc, int sc, int st) {
        for (int i = 0; i < a.length && vacancy > 0; i++) {
            if (open > 0) {
                System.out.println(a[i].studentname + "," +
                                   a[i].totalmarks + "," +
                                   a[i].category);
                open--;
            } else if (a[i].category.equals("BC") && bc > 0) {
                System.out.println(a[i].studentname + "," +
                                   a[i].totalnarks + "," +
                                   a[i].category);
                bc--;
            } else if (a[i].category.equals("SC") && sc > 0) {
                System.out.println(a[i].studentname + "," +
                                   a[i].totalmarks + "," +
                                   a[i].category);
                sc--;
            } else if (a[i].category.equals("ST") && st > 0) {
                System.out.println(a[i].studentname + "," +
                                   a[i].totalmarks + "," +
                                   a[i].category);
                st--;
            } else {

            }
        }
        vacancy--;
    }

    public static void toString(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].studentname + "," +
                               a[i].totalmarks + "," +
                               a[i].category);
        }
    }

    public static void main(String[] args) {
        Scanner ip =  new Scanner(System.in);
        int n = Integer.parseInt(ip.nextLine());
        Student[] students = new Student[n];
        int vacancynumber = Integer.parseInt(ip.nextLine());
        int openvacancy = Integer.parseInt(ip.nextLine());
        int bcvacancy = Integer.parseInt(ip.nextLine());
        int scvacancy = Integer.parseInt(ip.nextLine());
        int stvacancy = Integer.parseInt(ip.nextLine());
        for (int i = 0; i < n; i++) {
            String line = ip.nextLine();
            String[] tokens = line.split(",");
            student stu = new Student(tokens[0], tokens[1],
                                      Integer.parseInt(tokens[2]),
                                      Integer.parseInt(tokens[3]),
                                      Integer.parseInt(tokens[4]),
                                      Integer.parseInt(tokens[5]), tokens[6]);
            students[i] = stu;
        }
        InsertionSort insertion = new InsertionSort();
        insertion.sort(students);
        toString(students);
        System.out.println();
        mertiList(students, vacancynumber, openvacancy, bcvacancy, scvacancy, stvacancy);
    }
}
