class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        int a[] = new int[2];
        int j = 0;

        for(int num : nums){
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
        }
        for(int num : ans){
            a[j] = num;
            j++;
        }
        return a;
    }
}