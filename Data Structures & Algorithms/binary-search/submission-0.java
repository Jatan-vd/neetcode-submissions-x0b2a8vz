class Solution {
    public int search(int[] n, int target) {
        int l = 0, r = n.length - 1;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(n[mid] == target) {
                return mid;
            } else if(n[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return - 1;
    }
}
