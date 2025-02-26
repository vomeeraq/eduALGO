import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> q1 = new ArrayDeque<>();
        Deque<String> q2 = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] c = scanner.nextLine().split(" ");

            if (c[0].equals("+")) {
                q2.add(c[1]);
            } else if (c[0].equals("*")) {
                q2.addFirst(c[1]);
            } else {
                System.out.println(q1.poll());
            }

            if (q1.size() < q2.size()) {
                q1.add(q2.poll());
            }
        }

        scanner.close();
    }
}
