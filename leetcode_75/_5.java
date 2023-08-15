
class Solution_5 {

        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) {
                return "";
            }
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s, i, i + 1);
                int len = Math.max(len1, len2);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        public int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            }
            return right - left - 1;
        }



//    public String judge(String s){
//        if(s.length()<=1)return s;
//        if(s.length()==2)return s.charAt(0)==s.charAt(1)?s:String.valueOf(s.charAt(0));
//        int i=s.length()/2;
//        int j=0;
//
//        StringBuilder stringBuilder=new StringBuilder("");
//        if(i%2==0){
//            while (i>0 && i-j-1 >=0  && i+j<=s.length()){
//                if(s.charAt(i+j)==s.charAt(i-j-1)){
//                    stringBuilder.append(s.charAt(i-j));
//                    j++;
//                }else {
//                    break;
//                }
//            }
//        }else {
//            while (i>0 && i-j >=0  && i+j<=s.length()){
//                if(s.charAt(i-j)==s.charAt(i+j)){
//                    stringBuilder.append(s.charAt(i-j));
//                    j++;
//                }else {
//                    break;
//                }
//            }
//        }
//
//        StringBuilder x=new StringBuilder("");
//
//        for(int l=1;l<stringBuilder.length();l++){
//            x.append(stringBuilder.charAt(l));
//        }
//        if(s.length()%2==0){
//            x.append(stringBuilder.charAt(0));
//        }
//        x.append(stringBuilder);
//        return x.toString();
//    }
//    public String longestPalindrome(String s) {
//        if(s.length()<=1)return s;
//        if(s.length()==2)return s.charAt(0)==s.charAt(1)?s:String.valueOf(s.charAt(0));
//
//        int i=s.length()/2;
//        int sum=0;
//        String s1="";
//        String temp=judge(s);
//        if(temp.length()>sum){
//            sum=temp.length();
//            s1=temp;
//        }
//
//        for(int j=0;j<s.length()/2;j++){
//            //        left
//            temp = s.substring(j*2,s.length());
//            temp =judge(temp);
//            if(temp.length()>sum){
//                sum=temp.length();
//                s1=temp;
//            }
//            //        right
//            temp=s.substring(0,s.length()-j*2);
//            temp =judge(temp);
//            if(temp.length()>=sum){
//                sum=temp.length();
//                s1=temp;
//            }
//        }
//        temp=s.substring(0,2);
//        temp = judge(temp);
//        if(temp.length()>sum){
//            sum=temp.length();
//            s1=temp;
//        }
//        temp=s.substring(s.length()-2);
//        temp = judge(temp);
//        if(temp.length()>sum){
//            sum=temp.length();
//            s1=temp;
//        }
//        return  s1;
//    }
}
public class _5 {
    public static void main(String[] args) {
        Solution_5 solution =new Solution_5();
//        System.out.println(solution.longestPalindrome("babad"));
//        System.out.println(solution.longestPalindrome("cbbd"));
        System.out.println(solution.longestPalindrome("aaaa"));

//        System.out.println(solution.longestPalindrome("abb"));

    }
}
