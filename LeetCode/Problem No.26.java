class Solution {
    public int removeDuplicates(int[] nums) {
        
        int unique = 0;

        for(int currElement : nums){
            if(unique == 0 || currElement != nums[unique-1]){
                nums[unique] = currElement;
                unique++;
            }
        }
        return unique;
    }
}
