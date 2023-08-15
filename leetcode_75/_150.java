import java.util.Stack;

public class _150 {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack =new Stack<>();
        for (String s : tokens){
            switch (s){
                case "+":{
                    int i1 = Integer.valueOf(stack.pop());
                    int i2= Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i1+i2));
                    break;
                }
                case "*":{
                    int i1 = Integer.valueOf(stack.pop());
                    int i2= Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i1*i2));
                    break;
                }
                case "-":{
                    int i1 = Integer.valueOf(stack.pop());
                    int i2= Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i2-i1));
                    break;
                }
                case "/":{
                    int i1 = Integer.valueOf(stack.pop());
                    int i2= Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(i2/i1));
                    break;
                }
                default:{
                    stack.push(s);
                }
            }

//            原始代码
//            if (s.equals("+")){
//                int i1 = Integer.valueOf(stack.pop());
//                int i2= Integer.valueOf(stack.pop());
//                stack.push(String.valueOf(i1+i2));
//            }else if(s.equals("*")){
//                int i1 = Integer.valueOf(stack.pop());
//                int i2= Integer.valueOf(stack.pop());
//                stack.push(String.valueOf(i1*i2));
//            }else if((s.equals("-"))){
//                int i1 = Integer.valueOf(stack.pop());
//                int i2= Integer.valueOf(stack.pop());
//                stack.push(String.valueOf(i2-i1));
//            }else if(s.equals("/")){
//                int i1 = Integer.valueOf(stack.pop());
//                int i2= Integer.valueOf(stack.pop());
//                stack.push(String.valueOf(i2/i1));
//            }else {
//                stack.push(s);
//            }



//            优化
//            if (s.matches("-?\\d+")) {
//                stack.push(s);
//            } else {
//                int i1 = Integer.parseInt(stack.pop());
//                int i2 = Integer.parseInt(stack.pop());
//
//                switch (s) {
//                    case "+":
//                        stack.push(String.valueOf(i2 + i1));
//                        break;
//                    case "*":
//                        stack.push(String.valueOf(i2 * i1));
//                        break;
//                    case "-":
//                        stack.push(String.valueOf(i2 - i1));
//                        break;
//                    case "/":
//                        stack.push(String.valueOf(i2 / i1));
//                        break;
//                }
//            }
        }
        return Integer.parseInt(stack.peek());
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
