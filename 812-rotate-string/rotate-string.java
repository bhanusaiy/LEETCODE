class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length()!=goal.length()){
            return false;
        }
        String result="";
         for(int i=0;i<s.length();i++){
            if(result.equals(goal)){
                return true;
            }
            result=s.substring(1)+s.charAt(0);
            s=result;
         }
         return false;
    }
}