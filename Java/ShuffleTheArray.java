class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;

        int[] newArray = new int[nums.length];

        for(int i = 0; i < newArray.length - 1; i+=2){
            newArray[i] = nums[j];
            newArray[i+1] = nums[j+n];
            j++;
        }
        return newArray;
    }
}