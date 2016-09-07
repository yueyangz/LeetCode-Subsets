class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        
        Arrays.sort(nums);
        int size = nums.length;
        double subsetSize = Math.pow(2, size);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < subsetSize; i++) {
            result.add(new ArrayList<Integer>());   
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < subsetSize; j++) {
                if ((j >> i & 1) != 0) {
                    result.get(j).add(nums[i]);
                }
            }
         }
         return result;
    }
}