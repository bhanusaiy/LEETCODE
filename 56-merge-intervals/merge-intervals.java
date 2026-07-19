class Solution {
    public int[][] merge(int[][] intervals) {
    ArrayList <int[]> ans=new ArrayList<>();
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    ans.add(intervals[0]);
if(intervals.length==0){
    return new int[0][0];
}
    for(int i=1;i<intervals.length;i++){
        int[] last=ans.get(ans.size()-1);
        if(last[1]>=intervals[i][0]){
            last[1]=Math.max(last[1],intervals[i][1]);
        }
        else{
            ans.add(intervals[i]);
        }
    }
       return ans.toArray(new int[ans.size()][]);
    }
}