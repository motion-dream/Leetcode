class Solution_55 {
//    public boolean canJump(int[] nums) {
//        int n = nums.length;
//        int fartest=0;
//        for (int i=0;i<n-1;i++){
//            fartest = Math.max(fartest,i+nums[i]);
//            if(fartest<=i){
//                return false;
//            }
//        }
//        return fartest>=n-1;
//    }
    public boolean canJump(int[] nums) {
        if (nums.length==1)return true;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        for (int i=1;i<n-1;i++){
            if(dp[i-1]<i)return false;
            dp[i] = Math.max(dp[i-1],i+nums[i]);
        }
        return dp[n-2] >= nums.length-1;
    }
}
public class _55 {
    public static void main(String[] args) {
        Solution_55 solution= new Solution_55();
        System.out.println(solution.canJump(new int[]{2,3,1,1,4}));
    }
}
