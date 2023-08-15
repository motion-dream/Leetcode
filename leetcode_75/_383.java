public class _383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] m=new int[26];
        for (char c:magazine.toCharArray()){
            m[c-'a']++;
        }
        for (char c:ransomNote.toCharArray()){
            if(m[c-'a']--<1)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }
}
