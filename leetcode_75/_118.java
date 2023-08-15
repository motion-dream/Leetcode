import java.util.ArrayList;
import java.util.List;


class Solution_118{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        result.add(list);
        for (int i=1;i<numRows;i++){
            list=new ArrayList<>();
            list.add(1);
            for (int j=1;j<i;j++){
                list.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
public class _118 {
    public static void main(String[] args) {
        Solution_118 solution =new Solution_118();
        System.out.println(solution.generate(3).toString());
    }
}
