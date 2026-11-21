

class Solution {
    
    public boolean hasDuplicate(int[] nums) {

        // The boolean placeholder to return the result whether a duplicate is found
        boolean flag = false; 

        // integer placeholder to traverse through the in[] nums
        int c = 0;

        // Create an empty Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        // Add all elements in the integer array into the hashtable
        // meanwhile also do a check if the element is already in the hashtable
        // if the element is not yet in the hashtable add that element in

        while (c < nums.length && !flag) {
            if(!ht.containsKey(nums[c])){
                ht.put(nums[c], nums[c]);
                c++;
            }
            else{
                flag = true;
            }
        }

        return flag;      
    }
}