class Solution {
    public boolean isPalindrome(String s) {

        //Firstly, we remove all non-alphanumeric characters in String s
         s = s.replaceAll("[^a-zA-Z0-9]", "");

        //Secondling, we convert the input string s to a substring so that I can reverse the String
        StringBuilder sb = new StringBuilder(s)
            .reverse();
        
        //store the reversed back to String
        String reversedS = sb.toString();
        //
        if(s.equalsIgnoreCase(reversedS)){
            return true;
        }
        else
        {
            return false;
        }
    }
}
