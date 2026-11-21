

class Solution {
    
    public boolean hasDuplicate(int[] nums) {

        // The boolean placeholder to return the result whether a duplicate is found
        // The default is false, it will only change totrue if a duplicate is found
        boolean flag = false; 

        // integer placeholder to traverse through the in[] nums
        int c = 0;

        // Create an empty Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<>();


        // go through all the nums integer array table and immediately stop if you found  duplicate using a while loop and return a true
        // do a check if that key is not yet added in the hash table 
        // if the element is not yet in the hashtable add that element in the hashtable

        while (c < nums.length && !flag) {
            if(!ht.containsKey(nums[c])){
                ht.put(nums[c], nums[c]);
                c++;
            }
            else{
                flag = true;
            }
        }


        //return the boolean result if a duplicate is found 
        return flag;      
    }
}