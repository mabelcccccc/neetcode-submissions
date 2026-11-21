class Solution {
    public int[] twoSum(int[] nums, int target) {
        //default values to return for this function if there is a match
        int[] arrError = {0, 0};


        //a flag to exit a while loop 
        boolean flag = false;

        //checker for contraints
        if (nums.length >= 2 && nums.length <= 1000 ){

         
            //put a checker on the flag if there is a match on the condition
            while (!flag==true) {

                //go through all the integers in nums array starting from its first element
                //the reference integer will stop at the second last value, because the value it will need to compare to will be the last value
                for(int i = 0; i < nums.length-1; i++){

                    //testing
                    //System.out.println("i is: " + i);
                    
                    //compare it to the rest of the values in the nums array if there is a match
                    //the comparison to the other integers will start from the next value 
                    for(int j = i+1; j < nums.length; j++){
                        
                        //testing
                        //System.out.println("j is: " + j);

                        //checking if there is a match 
                        if(nums[i]+nums[j]==target){
                            arrError [0] = i;
                            arrError [1] = j;

                            //exist the while loop if there is a match
                            flag = true;
                        }

                    }
                }
            }
        }

        //return the int[]
        return arrError;
        
    }

    
}
