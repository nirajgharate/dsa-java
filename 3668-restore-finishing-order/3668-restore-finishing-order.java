class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[friends.length];

        for(int friend : friends){
            set.add(friend);
        }

        int j = 0;
        for(int num : order){
            if(set.contains(num)){
                ans[j] = num;
                j++;
            }
        }
        return ans;
    }
}