class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList <int[]> ans =new ArrayList<>();
             if(intervals.length==0){
            return new int[][] { newInterval };
        }
        int i=0;
      while(i<intervals.length){
        if(intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
        }
        else{
            break;
        }
        i++;
      }
      while(i<intervals.length){
         if(intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        else{
            break;

        }
      }
      ans.add(newInterval);
       while(i<intervals.length){ 
       ans.add(intervals[i]);
       i++;
       }
        return ans.toArray(new int[ans.size()][]); 
    }
}