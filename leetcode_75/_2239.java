class Solution_2239{
    public int findClosestNumber(int[] nums) {
        int temp_=nums[0];
        for (int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(temp_) || (Math.abs(nums[i])==Math.abs(temp_) && nums[i]>temp_)) {
                temp_ = nums[i];
            }
        }
        return temp_;
    }
}

public class _2239 {
    public static void main(String[] args) {
        Solution_2239 solution=new Solution_2239();
//        System.out.println(solution.findClosestNumber(new int[]{-4,-2,1,4,8}));
        System.out.println(solution.findClosestNumber(new int[]{2,-1,1}));
    }
}
