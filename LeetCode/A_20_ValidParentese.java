import java.util.Stack;

public class A_20_ValidParentese {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static boolean isVal(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                char top = stack.peek();
                if(c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{'){
                    stack.pop();
                }else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isVal(s));

    }
}
