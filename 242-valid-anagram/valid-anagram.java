class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
    return false;
        char[] chars1=s.toCharArray();
        Arrays.sort(chars1);
        String s1=new String(chars1);
        char[] chars2=t.toCharArray();
        Arrays.sort(chars2);
        String s2=new String(chars2);
        int i=0,j=s1.length();
        
        while(i<j){
        if(s1.charAt(i)!=s2.charAt(i) ){
        return false;
        }
        i++;
        
        }
        return true;
         }
}