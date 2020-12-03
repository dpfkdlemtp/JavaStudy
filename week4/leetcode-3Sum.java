class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i:nums)
            System.out.println(i);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=-nums[i];
            if(i>0 && nums[i]==nums[i-1]) continue; // 2sum=0
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                if(j>i+1 && nums[j]==nums[j-1])j++; // 이전 결과 중복 제거
                else if(nums[j]+nums[k]<c) j++;
                else if(nums[j]+nums[k]>c) k--;
                else {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++; k--;
                }
            }
        }
        return ans;
    }
}