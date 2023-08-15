import java.util.HashSet;
import java.util.Set;

class Solution_771 {
//    public int numJewelsInStones(String jewels, String stones) {
//        char[] charArray = stones.toCharArray();
//        char[] charArray1 = jewels.toCharArray();
//        int count=0;
//        for (int i=0;i<charArray.length;i++){
//            for(int j=0;j<charArray1.length;j++){
//                if (charArray[i]==charArray1[j]){
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<Character>();
        int count=0;
        for (int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for (int i=0;i<stones.length();i++){
            if (set.contains(stones.charAt(i)))count++;
        }
        return count;
    }
}
public class _771 {
    public static void main(String[] args) {
        Solution_771 solution=new Solution_771();
        System.out.println(solution.numJewelsInStones("aA","aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z","ZZ"));
    }
}
