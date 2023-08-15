import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class _239 {
//    超时
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int[] output = new int[nums.length-k+1];
//        int left=0,right=0;
//        while (right!=nums.length && left<nums.length-k+1){
//            int max = nums[left];
//            for (right=left;right<=left+k-1;right++){
//                if (nums[right]>=max){
//                    max = nums[right];
//                }
//            }
//            output[left]=max;
//            left++;
//        }
//        return output;
//    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        int[] output = new int[nums.length-k+1];
        TreeSet<Integer> sortedSet = new TreeSet<>();
        Queue<Integer> queue=new LinkedList<>();
        int max=nums[0];
        int _max=-10^4;
        sortedSet.add(max);
        sortedSet.add(_max);
        for (int i = 0;i<k;i++){
            queue.offer(nums[i]);
            if (nums[i]>max){
                sortedSet.add(_max);
                _max=max;
                max=nums[i];
            }
        }
        output[0]=max;

        for (int i=k;i<nums.length;i++){
            int x= queue.poll();
            if (x==max){
                queue.offer(nums[i]);
                if (nums[i]>_max){
                    max=nums[i];
                }else {
                    max=_max;
                    if(nums[i]>_max) _max=nums[i];
                }
            }else {
                queue.offer(nums[i]);
                if(nums[i]>_max && nums[i] <max) _max=nums[i];

                if (nums[i]>max){
                    _max=max;
                    max=nums[i];
                }
            }
            output[i-k+1]=max;
        }
        return output;
    }

    public static void main(String[] args) {
//        for (int i:maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)){
//            System.out.println(i);
//        }
//        for (int i:maxSlidingWindow(new int[]{1},1)){
//            System.out.println(i);
//        }
//        for (int i:maxSlidingWindow(new int[]{7,2,4},2)){
//            System.out.println(i);
//        }
//        for (int i:maxSlidingWindow(new int[]{1,3,1,2,0,5},3)){
//            System.out.println(i);
//        }
        for (int i:maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6},5)){
            System.out.println(i);
        }

    }
}
