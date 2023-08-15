import java.util.ArrayList;
import java.util.List;

class Solution_442 {
//    public List<Integer> findDuplicates(int[] nums) {
//        int[] temp=new int[nums.length];
//        for (int num:nums)temp[--num]++;
//        List<Integer> list=new ArrayList<>();
//        for (int i=0;i<temp.length;i++){
//            if (temp[i]>1)list.add(i+1);
//        }
//        return list;
//    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }
}
public class __442 {
    public static void main(String[] args) {
        Solution_442 solution = new Solution_442();
        System.out.println(solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDuplicates(new int[]{1,1,2}));
        System.out.println(solution.findDuplicates(new int[]{1}));
    }
}
