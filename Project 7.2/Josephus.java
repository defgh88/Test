import java.util.LinkedList;
import java.util.Scanner;
public class Josephus {
    public static void main(String[]args) {
        LinkedList<Integer> josephus = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Men: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            josephus.add(i);
        }
        System.out.println(josephus);
        while (josephus.size() > 1) {
            josephus.addLast(josephus.removeFirst());
            josephus.removeFirst();
            System.out.println(josephus);
        }
    }
}