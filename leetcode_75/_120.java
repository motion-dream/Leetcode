import java.util.ArrayList;
import java.util.List;

class Solution_120{
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] temp=new int[triangle.size()][triangle.size()];
        temp[0][0]=triangle.get(0).get(0);
        int min=triangle.get(0).get(0);
        for (int i=1;i<triangle.size();i++){
            temp[i][0]=temp[i-1][0]+triangle.get(i).get(0);
            min = temp[i][0];
            for (int j=1;j<triangle.get(i).size()-1;j++){

                temp[i][j] = Math.min(temp[i-1][j-1]+ triangle.get(i).get(j),temp[i-1][(i-1)==0?0:j]+ triangle.get(i).get(j)) ;
                if (temp[i][j]<min) min=temp[i][j];
            }
            int m= triangle.get(i).size()-1;
            temp[i][m]  = triangle.get(i).get(m) + temp[i-1][m-1];
            if (temp[i][m]<min) min=temp[i][m];
        }
        return min;
    }
}
public class _120 {
    public static void main(String[] args) {
        Solution_120 solution = new Solution_120();
        List<List<Integer>> triangle = new ArrayList<>();

        // Add each row to the triangle list
        triangle.add(new ArrayList<>(List.of(2)));
        triangle.add(new ArrayList<>(List.of(3, 4)));
        triangle.add(new ArrayList<>(List.of(6, 5, 7)));
        triangle.add(new ArrayList<>(List.of(4, 1, 8, 3)));
        List<List<Integer>> triangle1 = new ArrayList<>();
        triangle1.add(new ArrayList<>(List.of(-1)));
        triangle1.add(new ArrayList<>(List.of(-2, -3)));
        System.out.println(solution.minimumTotal(triangle));
        System.out.println(solution.minimumTotal(triangle1));
    }
}
