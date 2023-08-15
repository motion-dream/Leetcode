import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Solution_946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack=new Stack<>();
        int j=0;
        for (int i=0;i<pushed.length;i++){

            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//     if (pushed.length==0)return true;
//        int count=0;
//        for (int i=0;i<pushed.length;i++){
//            if (find(pushed,i,popped,0,count))return true;
//        }
//        return false;
//    }
//
//    public boolean find(int[] pushed,int i,int[] popped,int j,int count){
//        if (count==pushed.length)return true;
//        while (pushed[i]==-1 && i>0)i--;
//        for(;i<pushed.length;i++){
//            if (pushed[i]==popped[j]){
//                pushed[i]=-1;
//                count++;
//                if(find(pushed,Math.abs(i-1),popped,j+1,count))return true;
//            }
//        }
//        return false;
//    }
}
public class _946 {
    public static void main(String[] args) {
        Solution_946 solution=new Solution_946();
        System.out.println(solution.validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
        System.out.println(solution.validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2}));
        System.out.println(solution.validateStackSequences(new int[]{1,0},new int[]{1,0}));
        System.out.println(solution.validateStackSequences(new int[]{2,1,0},new int[]{2,1,0}));
    }
}
