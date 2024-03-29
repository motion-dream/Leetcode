import java.util.Stack;

public class _20 {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.peek()!=c){
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}

