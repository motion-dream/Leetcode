import java.util.*;
import java.util.stream.Collectors;

public class _347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
//        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
//        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

        PriorityQueue<int[]> pq =new PriorityQueue<>((pair1, pair2)->pair2[1]-pair1[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] ints = new int[k];
        for (int i=0;i<ints.length;i++){
            ints[i]= pq.poll()[0];
        }
        return ints;
    }

    public static void main(String[] args) {
        for (int i:topKFrequent(new int[]{1,1,1,2,2,3},2))
        System.out.println(i);
        for (int i:topKFrequent(new int[]{1},1))
            System.out.println(i);
    }
}
