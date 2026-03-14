class Solution {
    public int[] twoSum(int[] nums,int target) {
      int left =0;
      int right=nums.length-1;

  while(left < right) {
     int sum=nums[left] + nums[right];

      if(sum == target) {
         return new int[]{left,right};
      }
    else if(sum < target) {
       left++;
    }
    else{
      right--;
    }
  }
      return new int[]{-1,-1};
    }
}

// let me tell you the approach the approach is simple we are just checking the left and right pointers value and then moving accordingly whether it is behind the target or ahead of the target 


//Added Two Sum Solution using Two Pointers 
