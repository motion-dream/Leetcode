import java.util.ArrayList;
import java.util.List;

class Solution_119{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list_pre=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list_pre.add(1);list=list_pre;
        for (int i=1;i<=rowIndex;i++){
            list=new ArrayList<>();
            list.add(1);
            for (int j=1;j<i;j++){
                list.add(list_pre.get(j-1)+list_pre.get(j));
            }
            list.add(1);
            list_pre = list;
        }
        return list;
    }
}

public class _119 {
    public static void main(String[] args) {
        Solution_119 solution =new Solution_119();
        System.out.println(solution.getRow(3).toString());
    }
}
