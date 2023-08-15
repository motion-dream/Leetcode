class Solution_50 {
    public double myPow(double x, int n) {
//        double temp=1;
//        if(n>=0){
//            while (n-->0)temp*=x;
//
//        }else {
//            while (n++<0)temp*=1/x;
//        }
//        return temp;
        if (n == 0) {
            return 1.0;
        }

        double result = 1.0;
        long absN = Math.abs((long) n);

        while (absN > 0) {
            if (absN % 2 == 1) {
                result *= x;
            }
            x *= x;
            absN /= 2;
        }

        return n < 0 ? 1 / result : result;
    }
}
public class _50 {
    public static void main(String[] args) {
        Solution_50 solution=new Solution_50();
        System.out.println(solution.myPow(2.00000,8));
        System.out.println(solution.myPow(2.10000,3));
        System.out.println(solution.myPow(2.00000,-2));
    }
}
