class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        int start=0;
        while(start<l){
            char ch=s[start];
            s[start]=s[l];
            s[l]=ch;
            start++;
            l--;
        }

            
        
        
    }
}