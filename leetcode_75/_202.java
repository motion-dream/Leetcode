import java.util.Set;

public class _202 {
    public static boolean isHappy(int n) {
        int[] sm = new int[10];
        for (int i=0;i<10;i++){
            sm[i]=i*i;
        }


        while (n>=1){
            int sum=0;
            while (n/10>=1){
                sum += sm[n%10];
                n=n/10;
            }
            if(sum==1)return true;
            n=sum;
        }

        return false;
    }

    public static void main(String[] args) {
//        System.out.println(isHappy(19));
//        System.out.println(isHappy(2));
//        System.out.println(isHappy(1));
        System.out.println(isHappy(7));
    }
}
