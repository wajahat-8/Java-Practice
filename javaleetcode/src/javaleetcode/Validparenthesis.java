package javaleetcode;

import java.util.Stack;

public class Validparenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty, it means there's a closing bracket without a matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top character from the stack
                char top = stack.pop();
                
                // Check if the popped character matches the current closing bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were matched; otherwise, there are unmatched opening brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Validparenthesis vp = new Validparenthesis();
        
        // Test cases
        System.out.println(vp.isValid("()"));     // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("(]"));     // false
        System.out.println(vp.isValid("([)]"));   // false
        System.out.println(vp.isValid("{[]}"));   // true
    }
}
