class Solution_79 {
    public boolean exist(char[][] board, String word) {

        boolean[][] n=new boolean[board.length][board[0].length];

        boolean flag;
        int temp=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                n=new boolean[board.length][board[0].length];
                if (board[i][j]==word.charAt(0)){
                    n[i][j]=true;
                    flag=find(i,j,board,word,1,n);

                    if(flag==true)return flag;
                }

            }
        }
        return false;
    }

    private boolean find(int i, int j, char[][] board, String word,int t,boolean[][] n) {
        if(t==word.length())return true;
        boolean flag;

        for (;t<word.length();t++){
            if ((i-1)>=0){
                if (board[i-1][j]==word.charAt(t) && n[i-1][j]==false){
                    n[i-1][j]=true;
                    flag=find(i-1,j,board,word,t+1,n);
                    if (flag==true)return flag;
                    n[i-1][j]=false;
                }

            }
            if((i+1)<= board.length-1){
                if (board[i+1][j]==word.charAt(t) && n[i+1][j]==false){
                    n[i+1][j]=true;
                    flag=find(i+1,j,board,word,t+1,n);
                    if (flag==true)return flag;
                    n[i+1][j]=false;
                }
            }
            if((j-1)>=0){
                if (board[i][j-1]==word.charAt(t) && n[i][j-1]==false){
                    n[i][j-1]=true;
                    flag=find(i,j-1,board,word,t+1,n);
                    if (flag==true)return flag;
                    n[i][j-1]=false;
                }
            }
           if((j+1)<=board[0].length-1){
               if (board[i][j+1]==word.charAt(t) && n[i][j+1]==false){
                   n[i][j+1]=true;
                   flag=find(i,j+1,board,word,t+1,n);
                   if (flag==true)return flag;
                   n[i][j+1]=false;
               }
           }

           return false;

        }
        return false;
    }
}
public class _79 {
    public static void main(String[] args) {
        Solution_79 solution=new Solution_79();
        System.out.println(solution.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
        System.out.println(solution.exist(new char[][]{{'a','b'},{'c','d'}},"abcd"));
        System.out.println(solution.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB"));
        System.out.println(solution.exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}},"AAB"));
        System.out.println(solution.exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}},"ABCESEEEFS"));
    }

}
