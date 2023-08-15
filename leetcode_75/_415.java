class Solution_415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

//    public String addStrings(String num1, String num2) {
//        if(num2.length()==0)return num1;
//        if(num1.length()==0)return num2;
//        int i=num1.length();
//        int j=num2.length();
//        int cin=0;
//        StringBuilder s=new StringBuilder();
//        while (i--!=0 && j--!=0){
//            int temp = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(j))) + cin;
//            cin=0;
//            if(temp >= 10 ) cin++;
//            s.append(temp%10);
//            if(i==0 || j==0)break;
//        }
//        while (cin!=0){
//            if(i-->0){
//                int temp = Integer.parseInt(String.valueOf(num1.charAt(i)))+cin;
//                cin=0;
//                if(temp >= 10 ) cin++;
//                s.append(temp%10);
//            }
//            if(j-->0){
//                int temp = Integer.parseInt(String.valueOf(num2.charAt(j)))+cin;
//                cin=0;
//                if(temp >= 10 ) cin++;
//                s.append(temp%10);
//            }
//            if(i==0 && j==0){
//                s.append(cin);
//                cin=0;
//            }
//        }
//        if (i>0){
//            s.append(num1.substring(0,i));
//        }
//        if (j>0){
//            s.append(num2.substring(0,j));
//        }
//        return s.reverse().toString();
//    }
}
public class _415 {
    public static void main(String[] args) {
        Solution_415 solution=new Solution_415();
        System.out.println(solution.addStrings("11","123"));
        System.out.println(solution.addStrings("456","77"));
        System.out.println(solution.addStrings("0","0"));
    }
}
