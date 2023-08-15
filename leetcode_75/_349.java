import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> arrayList=new ArrayList<>();
        for (int i:nums1){
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i:nums2){
            if (set.contains(i) && set2.add(i))arrayList.add(i);
        }
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
