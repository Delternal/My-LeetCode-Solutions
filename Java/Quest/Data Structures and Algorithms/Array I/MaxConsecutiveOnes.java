class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak = 0;
        int maxStreak = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) streak++;
            else streak = 0;
            
            if(maxStreak < streak) maxStreak = streak;
        }
        return maxStreak;
    }
}