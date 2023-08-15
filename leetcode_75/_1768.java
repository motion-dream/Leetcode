class Solution_1768 {
    public  String mergeAlternately(String word1, String word2) {
        int i=word1.length();
        int j=word2.length();
        StringBuilder temp=new StringBuilder("");

        while (i !=0 && j!= 0){
            temp.append(word1.charAt(word1.length()-i--));
            temp.append(word2.charAt(word2.length()-j--));
        }
        if(i>0){
            temp.append(word1.substring(word1.length()-i));
        }else{
            temp.append(word2.substring(word2.length()-j));
        }
        return  temp.toString();
    }
}
public class _1768 {
    public static void main(String[] args) {
        Solution_1768 solution = new Solution_1768();
        System.out.println(solution.mergeAlternately("abc","pqr"));
        System.out.println(solution.mergeAlternately("ab","pqrs"));
        System.out.println(solution.mergeAlternately("abcd","pq"));
    }
}

