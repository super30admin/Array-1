// Time Complexity : O(n)
// Space Complexity : O(1) - since there will be contant number of characters 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
    //This solution uses a HashMap to keep track of frequency of each character
    //checks if the frequency is even, if so then adds the frequency
    //checks if it odd then tries increase count as many time as possible to create a longest palindrome
    //returns the count
        
// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, 1 + map.getOrDefault(c , 0));
        }

        int flag = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if( entry.getValue() % 2 == 0){
                count = count + entry.getValue();
            }
            else if(entry.getValue() % 2 > 0){
                int oddValue = entry.getValue();
                flag = flag + 1;
                if(oddValue > 1){
                    while( oddValue != 1){
                        oddValue = oddValue - 1;
                        count = count + 1;
                    }
                }
            }
        }

        if(flag >= 1){
            count = count + 1;
        }

        return count;

    }
}