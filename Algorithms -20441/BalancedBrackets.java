import java.util.Stack;
import java.util.StringJoiner;

public class BalancedBrackets {
    // function to check if brackets are balanced
    public static boolean areBracketsBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Stack<Character> stack = new Stack<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return (stack.isEmpty());
    }

    public static int countPairs(int n){
        return countPairs(n , 0 , 0 , "");
    }

    private static int countPairs(int n, int left, int leftTotal, String s) {

        if (s.length() == 2*n){
            System.out.println(s);
            return 1;
        }
        if (leftTotal == n){
            countPairs(n , left-1,leftTotal,s+")");
            return 1;
        }
        if (left > 0)
            return countPairs(n , left+1 , leftTotal+1 , s+"(") +
                    countPairs(n , left-1,leftTotal,s+")");
        return countPairs(n,left+1,leftTotal+1 ,s +"(");
    }
}
