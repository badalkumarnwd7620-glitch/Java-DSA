import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int []ans={-1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int patner=target - nums[i];
            if(map.containsKey(patner)){
                ans=new int []{i , map.get(patner)};
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
        
    }
}