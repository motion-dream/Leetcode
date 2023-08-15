public class _242 {
    public  static  boolean isAnagram(String s, String t) {
        int[] nums1 =new int[26];
        int[] nums2 =new int[26];
        for (char c:s.toCharArray()){
            nums1[c - 'a']++;
        }
        for (char c:t.toCharArray()){
            nums2[c - 'a']++;
        }
        for (int i=0;i<26;i++){
            if(nums1[i]!=nums2[i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "cat"));
    }
}
