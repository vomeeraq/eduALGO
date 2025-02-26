import java.util.Scanner;
import java.util.Stack;

public class BracketSequence {
    public static String isValidBrackets(String seq) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : seq.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "no";
                }
                char open = stack.pop();
                if ((bracket == ')' && open != '(') ||
                    (bracket == ']' && open != '[') ||
                    (bracket == '}' && open != '{')) {
                    return "no";
                }
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().trim();
        System.out.println(isValidBrackets(sequence));
        scanner.close();
    }
}
