import java.util.Stack;

public class _1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(c);
            }else {
                if(stack.peek()==c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }

        }
        StringBuilder builder=new StringBuilder();
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }
}
