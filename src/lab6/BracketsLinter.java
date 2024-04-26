package lab6;

import java.util.Stack;

public class BracketsLinter {
    public static void main(String[] args) {
        BracketsLinter bl = new BracketsLinter();
        System.out.println(bl.isValid("()")); // true
        System.out.println(bl.isValid("()[]{}")); // true
        System.out.println(bl.isValid("(]")); // false
        System.out.println(bl.isValid("([)]")); // false
        System.out.println(bl.isValid("{[]}")); // true
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}