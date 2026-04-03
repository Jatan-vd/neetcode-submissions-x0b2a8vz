class Solution {
    public int maxArea(int[] h) {

    int i = 0;
    int j = h.length - 1;
    int vol = 0;

    while(i < j){
        int temp = (j - i) * Math.min(h[i],h[j]);
        vol = Math.max(vol,temp);
        if(h[i] > h[j]){
            j--;
        }

        else{
       
            i++;
        }
    }
        return vol;
    }
}
