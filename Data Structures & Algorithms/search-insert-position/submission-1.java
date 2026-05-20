class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        int index = 0;


        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] > target){
                index = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                index = mid;
                low = mid + 1;
            }else{
                return mid;
            }
        }

        if(target > nums[mid]) return mid + 1;
        else return mid;
    }
    }
