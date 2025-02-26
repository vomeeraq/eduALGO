import java.util.Scanner;
import java.util.Stack;

public class TrainSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] train = new int[n];
        
        for (int i = 0; i < n; i++) {
            train[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println(canSortTrain(n, train) ? "YES" : "NO");
    }

    public static boolean canSortTrain(int n, int[] train) {
        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        for (int wagon : train) {
            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
            
            if (wagon == expected) {
                expected++;
            } else {
                stack.push(wagon);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != expected) {
                return false;
            }
            expected++;
        }

        return true;
    }
}
